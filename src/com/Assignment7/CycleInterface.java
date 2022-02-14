package com.Assignment7;

public interface CycleInterface
{
    public void UniCycle();
    public void BiCycle();
    public void TriCycle();
}
abstract class Fcatory1 implements CycleInterface
{
    @Override
    public void UniCycle() {

    }
}
abstract  class Factory2 implements CycleInterface
{
    @Override
    public void BiCycle() {

    }
}
abstract  class Factory3 implements  CycleInterface
{
    @Override
    public void TriCycle() {

    }
}

