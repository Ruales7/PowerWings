using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MenuCenariosManager : MonoBehaviour
{
    [SerializeField] private string nomedolevel;
    [SerializeField] private string nomedolevel2;
    [SerializeField] private string nomedolevel3;
    [SerializeField] private string voltarmenu;
    [SerializeField] private GameObject painelMenuInicial;

    public void JogarAquiles()
    {
        SceneManager.LoadScene(nomedolevel);
    }

    public void JogarHermes()
    {
        SceneManager.LoadScene(nomedolevel2);
    }

    public void JogarWingy()
    {
        SceneManager.LoadScene(nomedolevel3);
    }

    public void SairJogo()
    {
        SceneManager.LoadScene(voltarmenu);
    }   
}