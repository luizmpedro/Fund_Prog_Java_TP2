import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.Date;

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 5
 * 
 * In this version, the crab behaves as before, but we add animation of the 
 * image.
 */

public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;    
    private int wormsEaten;
    private boolean isPowerfull;
    private long startPowerTime;
    private boolean isFirstPlayer;
    
    /**
     * Create a crab and initialize its two images.
     */
    public Crab(boolean firstPlayer)
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        image3 = new GreenfootImage("pCrab.png");
        image4 = new GreenfootImage("pCrab2.png");
        setImage(image1);
        wormsEaten = 0;
        this.isPowerfull = true;
        this.isFirstPlayer = firstPlayer;
    }
            
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeypress();
        move(5);
        lookForWorm();
        lookForPotion();
        switchImage();
        
        World world = getWorld();
        
        if (this.isPowerfull) {
            world.showText("Powerfull", 100, 40);
        } else {
            world.showText("Not Powerfull", 100, 40);
        }
        
        if (this.isPowerfull) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - startPowerTime > 5000) {
                this.isPowerfull = false;
            }
        }
        
        if (this.getX() == 0) {
            this.setLocation(world.getWidth()-2, this.getY());
        }
        
        if (this.getY() == 0) {
            this.setLocation(this.getX(), world.getHeight()-2);
        }
        
        if (this.getX() == 559) {
            this.setLocation(1, this.getY());
        }
        
        if (this.getY() == 559) {
            this.setLocation(this.getX(), 1);
        }

    }
    
    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {  
        if (this.isPowerfull == false) {
            if (getImage() == image1) 
            {
                setImage(image2);
            }
            else
            {
                setImage(image1);
            }
        } else {
            if (getImage() == image3) 
            {
                setImage(image4);
            }
            else
            {
                setImage(image3);
            }
        }
    }
            
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if (this.isFirstPlayer) {
            if (Greenfoot.isKeyDown("left")) 
            {
                turn(-4);
            }
            if (Greenfoot.isKeyDown("right")) 
            {
                turn(4);
            }
        } else {
            if (Greenfoot.isKeyDown("1")) 
            {
                turn(-4);
            }
            if (Greenfoot.isKeyDown("2")) 
            {
                turn(4);
            }
        }
    }
    
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if ( isTouching(Worm.class) ) 
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            
            wormsEaten = wormsEaten + 1;
            
            if (wormsEaten == 8) 
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
    }

    public void lookForPotion() {
        if (isTouching(Potion.class)) {
            removeTouching(Potion.class);
            Greenfoot.playSound("invpot.wav");
            this.isPowerfull = true;
            this.startPowerTime = System.currentTimeMillis();
        }
    }
    
    public boolean isPowerfull() {
        return this.isPowerfull;
    }
}