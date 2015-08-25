package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.io.PrintStream;
import java.security.MessageDigest;

public class SHA1
  implements HASH
{
  MessageDigest md;

  public byte[] digest()
    throws Exception
  {
    return this.md.digest();
  }

  public int getBlockSize()
  {
    return 20;
  }

  public void init()
    throws Exception
  {
    try
    {
      this.md = MessageDigest.getInstance("SHA-1");
      return;
    }
    catch (Exception localException)
    {
      System.err.println(localException);
    }
  }

  public void update(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.md.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           /Users/kfinisterre/Desktop/Solo/3DRSoloHacks/unpacked_apk/classes_dex2jar.jar
 * Qualified Name:     com.jcraft.jsch.jce.SHA1
 * JD-Core Version:    0.6.2
 */