using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class cutscenemanager : MonoBehaviour
{
    [SerializeField] private string nomedolevel;
    [SerializeField] private string menuvoltar;

    public void Jogar()
    {
        SceneManager.LoadScene(nomedolevel);
    }

    public void SairJogo()
    {
        SceneManager.LoadScene(menuvoltar);
    }   
}