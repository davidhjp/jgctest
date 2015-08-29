package systemj.interfaces;
/**
 * 
 * This is the interface that needs to be implemented by the user when implementing their own
 * serializers and deserializers for socket communication
 * @author amal029
 * @version 1.0
 */
public interface Serializer{
	/**
	 * This method deserializes a byte arrray of length length and returns an Object
	 * @param b the byte array to deserialize
	 * @param length the length of the byte array
	 * @return the deserialized Object
	 */
	public Object deserialize(byte[] b,int length);
	/**
	 * This method serializes any Object into a byte array
	 * @param ob the Object to be serialized
	 * @return the byte array after serialization
	 */
	public byte[] serialize(Object ob);
}

