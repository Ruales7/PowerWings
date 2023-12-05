using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Score : MonoBehaviour
{
    
    public static int pontos=0;
    //public GameObject pontosText;
    public GameObject pontosInt;
    

    // Update is called once per frame
    void Update()
    {
        
        pontosInt.GetComponent<Text>().text = pontos +"";

        //int pontosAtuais = int.Parse(pontosInt.GetComponent<Text>().text);

        //pontosText.GetComponent<Text>().text = ""/
        
    }
}
