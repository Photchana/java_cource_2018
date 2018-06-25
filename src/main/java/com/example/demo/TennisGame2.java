package com.example.demo;

public class TennisGame2 {
	public int payer1Point = 0;
    public int Payer2Point = 0;
    
    public String payer1Result = "";
    public String payer2Result = "";


    public TennisGame2(String player1Name, String player2Name) {

    }

    public String getScore(){
        String score = "";
        if (payer1Point == Payer2Point && payer1Point < 3)
        {
//            if (payer1Point==0)
//                score = "Love";
//            if (payer1Point==1)
//                score = "Fifteen";
//            if (payer1Point==2)
//                score = "Thirty";
//            score += "-All";
        	return sayScore(payer1Point)+ "-All";
        }
        if (payer1Point==Payer2Point && payer1Point>=3)
            score = "Deuce";
        
        if (payer1Point > 0 && Payer2Point==0)
        {
            if (payer1Point==1)
                payer1Result = "Fifteen";
            if (payer1Point==2)
                payer1Result = "Thirty";
            if (payer1Point==3)
                payer1Result = "Forty";
            
            payer2Result = "Love";
            score = payer1Result + "-" + payer2Result;
        }
        if (Payer2Point > 0 && payer1Point==0)
        {
            if (Payer2Point==1)
                payer2Result = "Fifteen";
            if (Payer2Point==2)
                payer2Result = "Thirty";
            if (Payer2Point==3)
                payer2Result = "Forty";
            
            payer1Result = "Love";
            score = payer1Result + "-" + payer2Result;
        }
        
        if (payer1Point>Payer2Point && payer1Point < 4)
        {
            if (payer1Point==2)
                payer1Result="Thirty";
            if (payer1Point==3)
                payer1Result="Forty";
            if (Payer2Point==1)
                payer2Result="Fifteen";
            if (Payer2Point==2)
                payer2Result="Thirty";
            score = payer1Result + "-" + payer2Result;
        }
        if (Payer2Point>payer1Point && Payer2Point < 4)
        {
            if (Payer2Point==2)
                payer2Result="Thirty";
            if (Payer2Point==3)
                payer2Result="Forty";
            if (payer1Point==1)
                payer1Result="Fifteen";
            if (payer1Point==2)
                payer1Result="Thirty";
            score = payer1Result + "-" + payer2Result;
        }
        
        if (payer1Point > Payer2Point && Payer2Point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (Payer2Point > payer1Point && payer1Point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (payer1Point>=4 && Payer2Point>=0 && (payer1Point-Payer2Point)>=2)
        {
            score = "Win for player1";
        }
        if (Payer2Point>=4 && payer1Point>=0 && (Payer2Point-payer1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    private String sayScore(int point) {
    	String [] scores = {"Love","Fifteen","Thirty","Forty"};
    	return scores[point];
//    	if(point==0) 
//    		return "Love";
//    	if(point==1) 
//    		return "Fifteen";
//    	if(point==2) 
//    		return "Thirty";
//    	if(point==3) 
//    		return "Forty";
//    	throw new IllegalArgumentException();
    }
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
    	payer1Point++;
    }
    
    public void P2Score(){
    	Payer2Point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
