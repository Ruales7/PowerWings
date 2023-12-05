using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Gameover : MonoBehaviour
{

    [SerializeField] private string voltarmenu;
    

    public void SairJogo()
    {
        SceneManager.LoadScene(voltarmenu);
    }   
}