using System;
using System.Diagnostics;
using UnityEngine;

public class Gun : MonoBehaviour{


    public float damage = 10f;
    public float range = 100f;
    public float fireRate = 15f;
    public float impactForce = 30f;

    public Camera fpscamera;
    public ParticleSystem muzzleflash;
    public GameObject impactEffect;
    AudioSource m_shootingSound;

    private float nextTimeToFire = 0f;

    void Start()
    {
        m_shootingSound = GetComponent<AudioSource>();
    }
    // Update is called once per frame
    void Update ()
    {
        
        if (Input.GetButton("Fire1") && Time.time >= nextTimeToFire) 
        {
            m_shootingSound.Play();
            nextTimeToFire = Time.time + 1f / fireRate;
            Shoot();
        }

    }

    void Shoot ()
    {
        muzzleflash.Play();

        RaycastHit hit;
        if (Physics.Raycast(fpscamera.transform.position, fpscamera.transform.forward, out hit, range))
        {
            UnityEngine.Debug.Log(hit.transform.name);

            Target target = hit.transform.GetComponent<Target>();
            if (target != null)
            {
                target.TakeDamage(damage);
            }

            if (hit.rigidbody != null)
            {
                hit.rigidbody.AddForce(-hit.normal * impactForce);
            }

            GameObject impactGO = Instantiate(impactEffect, hit.point, Quaternion.LookRotation(hit.normal));
            Destroy(impactGO, 2f);
        }

    }
}

