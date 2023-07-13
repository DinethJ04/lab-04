package com.mycompany.game;
public class RegularPlayer extends Movements
{
    @Override
    public void MoveUp()
    {
        System.out.println("MovedUp");
    }
    @Override
    public void MoveDown()
    {
        System.out.println("MovedDown");
    }
    @Override
    public void MoveLeft()
    {
        System.out.println("Moved Left");
    }
    @Override
    public void MoveRight()
    {
        System.out.println("Moveed Right");
    }
}
