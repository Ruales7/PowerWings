using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DelayPortal : MonoBehaviour
{
    public GameObject Portal = null;
    public GameObject Aura = null;

    public void Start()
    {
        Portal.SetActive(true);
        Aura.SetActive(false);
        StartCoroutine(WaitBeforeShow());
    }

    private void ShowCharacters()
    {
        Portal.SetActive(true);
        Aura.SetActive(true);
    }

    private IEnumerator WaitBeforeShow()
    {
        Portal.SetActive(true);
        yield return new WaitForSeconds(50);
        Aura.SetActive(true);
    }

    
}