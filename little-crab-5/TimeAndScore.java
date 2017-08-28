import greenfoot.*;

public class TimeAndScore  
{
    private int currentScore;
    private int currentTime;
    private CrabWorld gameWorld;
    
    public TimeAndScore(CrabWorld world)
    {
        gameWorld = world;
        setScore(0);
        setTime(0);
    }
    
    public void updateScore(int value){
        currentScore += value;
        showScore();
    }
    
    public int getScore(){
        return currentScore;
    }
    
    public void setScore(int value){
        currentScore = value;
        showScore();
    }
    
    private void showScore(){
        drawString("Score: " + Integer.toString(currentScore), 450,20);
    }
    
    public void updateTime(int value){
        currentTime += value;
        showTime();
    }
    
    public int getTime(){
        return currentTime;
    }
    
    public void setTime(int value){
        currentTime = value;
        showTime();
    }
    
    private void showTime(){
        drawString("Time: " + Integer.toString(currentTimme), 20, 20);
    }
    
}
