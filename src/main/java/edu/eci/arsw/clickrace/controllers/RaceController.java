package edu.eci.arsw.clickrace.controllers;


import org.springframework.stereotype.Controller;


@Controller

public class RaceController{

    /* No esta sirviendo el simpMessagingTemplate por lo cual mandare el mensaje del winner en el front sin pasar por este broker 
    porque no tengo tiempo para arreglar el simpMessageTemplate
    @Autowired
    SimpMessagingTemplate msgt;

    @MessageMapping("/winner")
    public void handleWinner(String mycarnumber){
        msgt.convertAndSend("/topic/winner", mycarnumber);

    }*/

}
