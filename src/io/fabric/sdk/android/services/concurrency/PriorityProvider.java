package io.fabric.sdk.android.services.concurrency;

public abstract interface PriorityProvider<T> extends Comparable<T>
{
  public abstract Priority getPriority();
}

/* Location:           /Users/kfinisterre/Desktop/Solo/3DRSoloHacks/unpacked_apk/classes_dex2jar.jar
 * Qualified Name:     io.fabric.sdk.android.services.concurrency.PriorityProvider
 * JD-Core Version:    0.6.2
 */