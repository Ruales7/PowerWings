using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MenuPrincipalManager : MonoBehaviour
{
    [SerializeField] private string nomedolevel;
    [SerializeField] private GameObject painelMenuInicial;

    public void Jogar()
    {
        SceneManager.LoadScene(nomedolevel);
    }

    public void SairJogo()
    {
        Debug.Log("Sair do Jogo");
        Application.Quit();
    }   
}