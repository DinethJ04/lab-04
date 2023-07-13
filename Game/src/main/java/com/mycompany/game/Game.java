package com.mycompany.game;
public class Game 
{
    public static void main(String[] args) 
    {
        RegularPlayer r=new RegularPlayer();
        r.MoveUp();
        r.MoveDown();
        r.MoveLeft();
        r.MoveRight();
        
        JumpingPlayer j=new JumpingPlayer();
        j.MoveUp();
        j.MoveDown();
        j.MoveLeft();
        j.MoveRight();
        
        CrouchingPlayer c=new CrouchingPlayer();
        c.MoveUp();
        c.MoveDown();
        c.MoveLeft();
        c.MoveRight();
    }
}
