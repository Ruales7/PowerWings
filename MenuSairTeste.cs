
using UnityEngine;
using UnityEngine.SceneManagement;

public class MenuSairTeste : MonoBehaviour
{
    [SerializeField] private GameObject pausemenu;
    
    public void PauseButton()
    {
        Input.GetKeyDown(KeyCode.Tab);
        Time.timeScale = 0f;
        pausemenu.SetActive(true);
    }
}


