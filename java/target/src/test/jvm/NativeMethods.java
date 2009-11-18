/*
  This file is part of JOP, the Java Optimized Processor
    see <http://www.jopdesign.com/>

  Copyright (C) 2001-2008, Martin Schoeberl (martin@jopdesign.com)

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package jvm;

import com.jopdesign.sys.Native;

public class NativeMethods extends TestCase {

	int a, b, c;
	long l;
	char ch;
	NativeMethods ref;
	static NativeMethods sref;
	NativeMethods refa[];
	
	public String toString() {
		return "NativeMethods";
	}
	
	public boolean test() {

		boolean ok = true;
		
		a = 1;
		b = 2; 
		c = 3;
		
		int ref = Native.toInt(this);
		ok &= Native.getField(ref, 0)==1;
		ok &= Native.getField(ref, 1)==2;
		ok &= Native.getField(ref, 2)==3;
		
		Native.putField(ref, 0, 111);
		Native.putField(ref, 1, 222);
		Native.putField(ref, 2, 333);
		
		ok &= a==111;
		ok &= b==222;
		ok &= c==333;
		
		return ok;
	}
	
}