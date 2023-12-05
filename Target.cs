using UnityEngine;
using UnityEngine.UI;

public class Target : MonoBehaviour

{
  
    public float health = 50f;
    public ParticleSystem explosao;


    public void TakeDamage (float amount)
    {
        health -= amount;
        if (health <= 0f)
        {
            Score.pontos += 1;
            explosao.Play();
            Destroy(gameObject);
        }
    }
}