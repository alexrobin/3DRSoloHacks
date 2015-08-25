package com.jcraft.jsch.jce;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BlowfishCBC
  implements com.jcraft.jsch.Cipher
{
  private static final int bsize = 16;
  private static final int ivsize = 8;
  private javax.crypto.Cipher cipher;

  public int getBlockSize()
  {
    return 16;
  }

  public int getIVSize()
  {
    return 8;
  }

  public void init(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    if (paramArrayOfByte2.length > 8)
    {
      byte[] arrayOfByte2 = new byte[8];
      System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, 0, arrayOfByte2.length);
      paramArrayOfByte2 = arrayOfByte2;
    }
    if (paramArrayOfByte1.length > 16)
    {
      byte[] arrayOfByte1 = new byte[16];
      System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 0, arrayOfByte1.length);
      paramArrayOfByte1 = arrayOfByte1;
    }
    while (true)
    {
      try
      {
        SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte1, "Blowfish");
        this.cipher = javax.crypto.Cipher.getInstance("Blowfish/CBC/" + "NoPadding");
        try
        {
          javax.crypto.Cipher localCipher = this.cipher;
          if (paramInt == 0)
          {
            i = 1;
            localCipher.init(i, localSecretKeySpec, new IvParameterSpec(paramArrayOfByte2));
            return;
          }
        }
        finally
        {
        }
      }
      catch (Exception localException)
      {
        throw localException;
      }
      int i = 2;
    }
  }

  public boolean isCBC()
  {
    return true;
  }

  public void update(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
    throws Exception
  {
    this.cipher.update(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3);
  }
}

/* Location:           /Users/kfinisterre/Desktop/Solo/3DRSoloHacks/unpacked_apk/classes_dex2jar.jar
 * Qualified Name:     com.jcraft.jsch.jce.BlowfishCBC
 * JD-Core Version:    0.6.2
 */