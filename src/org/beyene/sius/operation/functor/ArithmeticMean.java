package org.beyene.sius.operation.functor;

import org.beyene.sius.dimension.Dimension;
import org.beyene.sius.unit.Unit;

public abstract interface ArithmeticMean<D extends Dimension<D>, B extends Unit<D, B, B>, TARGET_UNIT extends Unit<D, B, TARGET_UNIT>> extends Functor<D, B, TARGET_UNIT, ArithmeticMean<D, B, TARGET_UNIT>>
{
}

/* Location:           /Users/kfinisterre/Desktop/Solo/3DRSoloHacks/unpacked_apk/classes_dex2jar.jar
 * Qualified Name:     org.beyene.sius.operation.functor.ArithmeticMean
 * JD-Core Version:    0.6.2
 */