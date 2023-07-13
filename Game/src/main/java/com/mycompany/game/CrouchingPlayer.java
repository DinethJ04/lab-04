package com.mycompany.game;
public class CrouchingPlayer extends Movements
{
    @Override
    public void MoveUp()
    {
        System.out.println("Crouched Up by 2 spaces");
    }
    @Override
    public void MoveDown()
    {
        System.out.println("Crouched Down by 2 spaces");
    }
    @Override
    public void MoveLeft()
    {
        System.out.println("Crouched Left by 2 spaces");
    }
    @Override
    public void MoveRight()
    {
        System.out.println("Crouched Right by 2 spaces");
    }
}
