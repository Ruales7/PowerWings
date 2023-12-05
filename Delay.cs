using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Delay : MonoBehaviour
{
    public GameObject portal;
    

    void Start()
    {
        Invoke("SpawnDelay", 5);
    }

    private void SpawnDelay()
    {
        portal.SetActive(true);
    }
}
