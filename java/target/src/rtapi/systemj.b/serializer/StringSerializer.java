package systemj.serializer;

import systemj.interfaces.Serializer;

public class StringSerializer implements Serializer
{
	public Object deserialize(byte[] msg, int length)
	{
		String str = new String(msg);
		return (Object)str;
	}

	public byte[] serialize(Object obj)
	{
		String str = (String)obj;
		return str.getBytes();
	}
}
