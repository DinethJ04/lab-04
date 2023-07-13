package com.mycompany.game;
public class JumpingPlayer extends Movements
{
    @Override
    public void MoveUp()
    {
        System.out.println("Jumped Up by 5 spaces");
    }
    @Override
    public void MoveDown()
    {
        System.out.println("Jumped Down by 5 spaces");
    }
    @Override
    public void MoveLeft()
    {
        System.out.println("Jumped Left by 5 spaces");
    }
    @Override
    public void MoveRight()
    {
        System.out.println("Jumped Right by 5 spaces");
    }
}
