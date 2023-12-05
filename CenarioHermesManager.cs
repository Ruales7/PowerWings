using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class CenarioHermesManager : MonoBehaviour
{
    [SerializeField] private string nomedolevel;
    [SerializeField] private string nomedolevel2;
    [SerializeField] private string nomedolevel3;
    [SerializeField] private string voltarmenu;
    [SerializeField] private GameObject painelMenuInicial;

    public void JogarFazendaHermes()
    {
        SceneManager.LoadScene(nomedolevel);
    }

    public void JogarCidadeHermes()
    {
        SceneManager.LoadScene(nomedolevel2);
    }

    public void JogarEspacoHermes()
    {
        SceneManager.LoadScene(nomedolevel3);
    }

    public void SairJogo()
    {
        SceneManager.LoadScene(voltarmenu);
    }   
}