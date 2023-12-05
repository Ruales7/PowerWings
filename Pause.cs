using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
 
public class Pause : MonoBehaviour
{
    public Transform pauseMenu;
    public string voltar;
    
    // Start is called before the first frame update
    void Start()
    {
       
    }

    // Update is called once per frame
    void Update()
    {
        if(Input.GetKeyDown(KeyCode.P))
        {
            if(pauseMenu.gameObject.activeSelf)
            {
                pauseMenu.gameObject.SetActive(true);
                Time.timeScale = 0;
                Cursor.lockState = CursorLockMode.None;
                Cursor.visible = true;
                
            }
            else
            {
                pauseMenu.gameObject.SetActive(false);
                Time.timeScale = 1;
                Cursor.lockState = CursorLockMode.Locked;
                Cursor.visible = false;
            }  
    }
    }
    public void ResumeGame()
    {
       pauseMenu.gameObject.SetActive(false);
                Time.timeScale = 1; 
                Cursor.lockState = CursorLockMode.Locked;
                Cursor.visible = false;
    }
    public void sair()
    {
        SceneManager.LoadScene(voltar);
    }
}
