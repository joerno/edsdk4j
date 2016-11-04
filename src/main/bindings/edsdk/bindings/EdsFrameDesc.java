package edsdk.bindings;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : EDSDK/Header/EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsFrameDesc extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong valid;
	/** C type : EdsUInt32 */
	public NativeLong selected;
	/** C type : EdsUInt32 */
	public NativeLong justFocus;
	/** C type : EdsRect */
	public EdsRect rect;
	/** C type : EdsUInt32 */
	public NativeLong reserved;
	public EdsFrameDesc() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("valid", "selected", "justFocus", "rect", "reserved");
	}
	/**
	 * @param valid C type : EdsUInt32<br>
	 * @param selected C type : EdsUInt32<br>
	 * @param justFocus C type : EdsUInt32<br>
	 * @param rect C type : EdsRect<br>
	 * @param reserved C type : EdsUInt32
	 */
	public EdsFrameDesc(NativeLong valid, NativeLong selected, NativeLong justFocus, EdsRect rect, NativeLong reserved) {
		super();
		this.valid = valid;
		this.selected = selected;
		this.justFocus = justFocus;
		this.rect = rect;
		this.reserved = reserved;
	}
	public EdsFrameDesc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsFrameDesc implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsFrameDesc implements Structure.ByValue {
		
	};
}