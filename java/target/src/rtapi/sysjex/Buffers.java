package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import buffer.*;
import fibonacci.*;
import com.jopdesign.sys.Native;

public class Buffers extends ClockDomain{
  public Buffers(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public input_Channel producerChannel_in = new input_Channel();
  public output_Channel consumerChannel_o = new output_Channel();
  private static Signal bufferNotFull_12;
  private static Signal bufferNotEmpty_12;
  private static Signal requestData_12;
  private static Signal toBuffer_12;
  private static Signal fromBuffer_12;
  private static int data_thread_13;
  private static int tutu__2090381980;
  private static int tutu__1870174605;
  private static int data_thread_14;
  private static Buffer myBuffer_thread_15;
  private static int data_thread_15;
  private static int tutu__2082687002;
  private static int tutu__235319565;
  private static int tutu__2076915769;
  private static int tutu__82920110;
  private static int tutu__2087688738;
  private static int tutu__1923250131;
  private static int tutu__2095383716;
  private static int tutu__288395092;
  private static int S1555 = 1;
  private static int S847 = 1;
  private static int S846 = 1;
  private static int S725 = 1;
  private static int S723 = 1;
  private static int S705 = 1;
  private static int S1419 = 1;
  private static int S1418 = 1;
  private static int S942 = 1;
  private static int S848 = 1;
  private static int S855 = 1;
  private static int S850 = 1;
  private static int S1553 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread1683250556(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      switch(S1553){
      case 0 : 
	active[15]=0;
	ends[15]=0;
	tdone[15]=1;
	break;
      case 1 : 
	if(toBuffer_12.getprestatus()){
	  myBuffer_thread_15.push((Integer)toBuffer_12.getpreval());
	  if(requestData_12.getprestatus()){
	    data_thread_15 = ((Integer)myBuffer_thread_15.pop()).intValue();
	    fromBuffer_12.setPresent();
	    currsigs.addElement(fromBuffer_12);
	    fromBuffer_12.setValue(data_thread_15);
	    //.println("Emitted fromBuffer_12");
	    if(!myBuffer_thread_15.isFull()){
	      bufferNotFull_12.setPresent();
	      currsigs.addElement(bufferNotFull_12);
	      //.println("Emitted bufferNotFull_12");
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	    else {
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isFull()){
	      bufferNotFull_12.setPresent();
	      currsigs.addElement(bufferNotFull_12);
	      //.println("Emitted bufferNotFull_12");
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	    else {
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	  }
	}
	else {
	  if(requestData_12.getprestatus()){
	    data_thread_15 = ((Integer)myBuffer_thread_15.pop()).intValue();
	    fromBuffer_12.setPresent();
	    currsigs.addElement(fromBuffer_12);
	    fromBuffer_12.setValue(data_thread_15);
	    //.println("Emitted fromBuffer_12");
	    if(!myBuffer_thread_15.isFull()){
	      bufferNotFull_12.setPresent();
	      currsigs.addElement(bufferNotFull_12);
	      //.println("Emitted bufferNotFull_12");
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	    else {
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isFull()){
	      bufferNotFull_12.setPresent();
	      currsigs.addElement(bufferNotFull_12);
	      //.println("Emitted bufferNotFull_12");
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	    else {
	      if(!myBuffer_thread_15.isEmpty()){
		bufferNotEmpty_12.setPresent();
		currsigs.addElement(bufferNotEmpty_12);
		//.println("Emitted bufferNotEmpty_12");
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	      else {
		active[15]=1;
		ends[15]=1;
		tdone[15]=1;
	      }
	    }
	  }
	}
	break;
      }
    }
  }
  public void thread1684789552(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      switch(S1419){
      case 0 : 
	active[14]=0;
	ends[14]=0;
	tdone[14]=1;
	break;
      case 1 : 
	switch(S1418){
	case 0 : 
	  switch(S942){
	  case 0 : 
	    switch(S848){
	    case 0 : 
	      S848=0;
	      S848=1;
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	      break;
	    case 1 : 
	      S848=1;
	      S848=2;
	      if(fromBuffer_12.getprestatus()){
		data_thread_14 = (Integer)fromBuffer_12.getpreval();
		S855=0;
		if(consumerChannel_o.get_preempted()){
		  tutu__1923250131 = 0;
		  tutu__1923250131 = consumerChannel_o.get_preempted() ? consumerChannel_o.refresh() : 0;
		  S855=1;
		  active[14]=1;
		  ends[14]=1;
		  tdone[14]=1;
		}
		else {
		  S850=0;
		  if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		    tutu__2087688738 = 0;
		    tutu__2087688738 = consumerChannel_o.get_w_s();
		    tutu__2087688738++;
		    consumerChannel_o.set_w_s(tutu__2087688738);
		    consumerChannel_o.set_value(new Integer(data_thread_14));
		    S850=1;
		    if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		      ends[14]=2;
		      ;
		      S942=1;
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		    else {
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		  }
		  else {
		    active[14]=1;
		    ends[14]=1;
		    tdone[14]=1;
		  }
		}
	      }
	      else {
		S942=1;
		active[14]=1;
		ends[14]=1;
		tdone[14]=1;
	      }
	      break;
	    case 2 : 
	      switch(S855){
	      case 0 : 
		if(consumerChannel_o.get_preempted()){
		  tutu__288395092 = 0;
		  tutu__288395092 = consumerChannel_o.get_preempted() ? consumerChannel_o.refresh() : 0;
		  S855=1;
		  active[14]=1;
		  ends[14]=1;
		  tdone[14]=1;
		}
		else {
		  switch(S850){
		  case 0 : 
		    if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		      tutu__2095383716 = 0;
		      tutu__2095383716 = consumerChannel_o.get_w_s();
		      tutu__2095383716++;
		      consumerChannel_o.set_w_s(tutu__2095383716);
		      consumerChannel_o.set_value(new Integer(data_thread_14));
		      S850=1;
		      if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
			ends[14]=2;
			;
			S942=1;
			active[14]=1;
			ends[14]=1;
			tdone[14]=1;
		      }
		      else {
			active[14]=1;
			ends[14]=1;
			tdone[14]=1;
		      }
		    }
		    else {
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		    break;
		  case 1 : 
		    if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		      ends[14]=2;
		      ;
		      S942=1;
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		    else {
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		    break;
		  }
		}
		break;
	      case 1 : 
		S855=1;
		S855=0;
		if(consumerChannel_o.get_preempted()){
		  tutu__288395092 = 0;
		  tutu__288395092 = consumerChannel_o.get_preempted() ? consumerChannel_o.refresh() : 0;
		  S855=1;
		  active[14]=1;
		  ends[14]=1;
		  tdone[14]=1;
		}
		else {
		  S850=0;
		  if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		    tutu__2095383716 = 0;
		    tutu__2095383716 = consumerChannel_o.get_w_s();
		    tutu__2095383716++;
		    consumerChannel_o.set_w_s(tutu__2095383716);
		    consumerChannel_o.set_value(new Integer(data_thread_14));
		    S850=1;
		    if(consumerChannel_o.get_w_s() == consumerChannel_o.get_w_r()){
		      ends[14]=2;
		      ;
		      S942=1;
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		    else {
		      active[14]=1;
		      ends[14]=1;
		      tdone[14]=1;
		    }
		  }
		  else {
		    active[14]=1;
		    ends[14]=1;
		    tdone[14]=1;
		  }
		}
		break;
	      }
	      break;
	    }
	    break;
	  case 1 : 
	    S942=1;
	    S942=0;
	    if(bufferNotEmpty_12.getprestatus()){
	      requestData_12.setPresent();
	      currsigs.addElement(requestData_12);
	      //.println("Emitted requestData_12");
	      S848=0;
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	    }
	    else {
	      S942=1;
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	    }
	    break;
	  }
	  break;
	case 1 : 
	  S1418=1;
	  S1419=0;
	  active[14]=0;
	  ends[14]=0;
	  tdone[14]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1999129403(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      switch(S847){
      case 0 : 
	active[13]=0;
	ends[13]=0;
	tdone[13]=1;
	break;
      case 1 : 
	switch(S846){
	case 0 : 
	  switch(S725){
	  case 0 : 
	    switch(S723){
	    case 0 : 
	      switch(S705){
	      case 0 : 
		if(producerChannel_in.get_preempted()){
		  tutu__235319565 = 0;
		  tutu__235319565 = producerChannel_in.get_preempted() ? producerChannel_in.refresh() : 0;
		  S705=1;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(producerChannel_in.get_r_s() > producerChannel_in.get_r_r()){
		    tutu__2082687002 = 0;
		    tutu__2082687002 = producerChannel_in.get_r_r();
		    tutu__2082687002++;
		    producerChannel_in.set_r_r(tutu__2082687002);
		    producerChannel_in.get_val();
		    ends[13]=2;
		    ;
		    S723=1;
		    if(producerChannel_in.get_value() != null){
		      data_thread_13 = (Integer)producerChannel_in.get_value();
		      toBuffer_12.setPresent();
		      currsigs.addElement(toBuffer_12);
		      toBuffer_12.setValue(data_thread_13);
		      //.println("Emitted toBuffer_12");
		      active[13]=1;
		      ends[13]=1;
		      tdone[13]=1;
		    }
		    else {
		      S725=1;
		      active[13]=1;
		      ends[13]=1;
		      tdone[13]=1;
		    }
		  }
		  else {
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
		break;
	      case 1 : 
		S705=1;
		S705=0;
		if(producerChannel_in.get_preempted()){
		  tutu__235319565 = 0;
		  tutu__235319565 = producerChannel_in.get_preempted() ? producerChannel_in.refresh() : 0;
		  S705=1;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(producerChannel_in.get_r_s() > producerChannel_in.get_r_r()){
		    tutu__2082687002 = 0;
		    tutu__2082687002 = producerChannel_in.get_r_r();
		    tutu__2082687002++;
		    producerChannel_in.set_r_r(tutu__2082687002);
		    producerChannel_in.get_val();
		    ends[13]=2;
		    ;
		    S723=1;
		    if(producerChannel_in.get_value() != null){
		      data_thread_13 = (Integer)producerChannel_in.get_value();
		      toBuffer_12.setPresent();
		      currsigs.addElement(toBuffer_12);
		      toBuffer_12.setValue(data_thread_13);
		      //.println("Emitted toBuffer_12");
		      active[13]=1;
		      ends[13]=1;
		      tdone[13]=1;
		    }
		    else {
		      S725=1;
		      active[13]=1;
		      ends[13]=1;
		      tdone[13]=1;
		    }
		  }
		  else {
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
		break;
	      }
	      break;
	    case 1 : 
	      S725=1;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	      break;
	    }
	    break;
	  case 1 : 
	    S725=1;
	    S725=0;
	    if(bufferNotFull_12.getprestatus()){
	      S723=0;
	      S705=0;
	      if(producerChannel_in.get_preempted()){
		tutu__82920110 = 0;
		tutu__82920110 = producerChannel_in.get_preempted() ? producerChannel_in.refresh() : 0;
		S705=1;
		active[13]=1;
		ends[13]=1;
		tdone[13]=1;
	      }
	      else {
		if(producerChannel_in.get_r_s() > producerChannel_in.get_r_r()){
		  tutu__2076915769 = 0;
		  tutu__2076915769 = producerChannel_in.get_r_r();
		  tutu__2076915769++;
		  producerChannel_in.set_r_r(tutu__2076915769);
		  producerChannel_in.get_val();
		  ends[13]=2;
		  ;
		  S723=1;
		  if(producerChannel_in.get_value() != null){
		    data_thread_13 = (Integer)producerChannel_in.get_value();
		    toBuffer_12.setPresent();
		    currsigs.addElement(toBuffer_12);
		    toBuffer_12.setValue(data_thread_13);
		    //.println("Emitted toBuffer_12");
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		  else {
		    S725=1;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
		else {
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
	      }
	    }
	    else {
	      S725=1;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    break;
	  }
	  break;
	case 1 : 
	  S846=1;
	  S847=0;
	  active[13]=0;
	  ends[13]=0;
	  tdone[13]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1990280178(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      S1553=1;
      myBuffer_thread_15 = new Buffer(100);
      data_thread_15 = 0;
      if(toBuffer_12.getprestatus()){
	myBuffer_thread_15.push((Integer)toBuffer_12.getpreval());
	if(requestData_12.getprestatus()){
	  data_thread_15 = ((Integer)myBuffer_thread_15.pop()).intValue();
	  fromBuffer_12.setPresent();
	  currsigs.addElement(fromBuffer_12);
	  fromBuffer_12.setValue(data_thread_15);
	  //.println("Emitted fromBuffer_12");
	  if(!myBuffer_thread_15.isFull()){
	    bufferNotFull_12.setPresent();
	    currsigs.addElement(bufferNotFull_12);
	    //.println("Emitted bufferNotFull_12");
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	}
	else {
	  if(!myBuffer_thread_15.isFull()){
	    bufferNotFull_12.setPresent();
	    currsigs.addElement(bufferNotFull_12);
	    //.println("Emitted bufferNotFull_12");
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	}
      }
      else {
	if(requestData_12.getprestatus()){
	  data_thread_15 = ((Integer)myBuffer_thread_15.pop()).intValue();
	  fromBuffer_12.setPresent();
	  currsigs.addElement(fromBuffer_12);
	  fromBuffer_12.setValue(data_thread_15);
	  //.println("Emitted fromBuffer_12");
	  if(!myBuffer_thread_15.isFull()){
	    bufferNotFull_12.setPresent();
	    currsigs.addElement(bufferNotFull_12);
	    //.println("Emitted bufferNotFull_12");
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	}
	else {
	  if(!myBuffer_thread_15.isFull()){
	    bufferNotFull_12.setPresent();
	    currsigs.addElement(bufferNotFull_12);
	    //.println("Emitted bufferNotFull_12");
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  else {
	    if(!myBuffer_thread_15.isEmpty()){
	      bufferNotEmpty_12.setPresent();
	      currsigs.addElement(bufferNotEmpty_12);
	      //.println("Emitted bufferNotEmpty_12");
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	}
      }
    }
  }
  public void thread1990664927(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      S1419=1;
      data_thread_14 = 0;
      S1418=0;
      S942=0;
      if(bufferNotEmpty_12.getprestatus()){
	requestData_12.setPresent();
	currsigs.addElement(requestData_12);
	//.println("Emitted requestData_12");
	S848=0;
	active[14]=1;
	ends[14]=1;
	tdone[14]=1;
      }
      else {
	S942=1;
	active[14]=1;
	ends[14]=1;
	tdone[14]=1;
      }
    }
  }
  public void thread1993358169(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      S847=1;
      data_thread_13 = 0;
      S846=0;
      S725=0;
      if(bufferNotFull_12.getprestatus()){
	S723=0;
	S705=0;
	if(producerChannel_in.get_preempted()){
	  tutu__1870174605 = 0;
	  tutu__1870174605 = producerChannel_in.get_preempted() ? producerChannel_in.refresh() : 0;
	  S705=1;
	  active[13]=1;
	  ends[13]=1;
	  tdone[13]=1;
	}
	else {
	  if(producerChannel_in.get_r_s() > producerChannel_in.get_r_r()){
	    tutu__2090381980 = 0;
	    tutu__2090381980 = producerChannel_in.get_r_r();
	    tutu__2090381980++;
	    producerChannel_in.set_r_r(tutu__2090381980);
	    producerChannel_in.get_val();
	    ends[13]=2;
	    ;
	    S723=1;
	    if(producerChannel_in.get_value() != null){
	      data_thread_13 = (Integer)producerChannel_in.get_value();
	      toBuffer_12.setPresent();
	      currsigs.addElement(toBuffer_12);
	      toBuffer_12.setValue(data_thread_13);
	      //.println("Emitted toBuffer_12");
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      S725=1;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	  }
	  else {
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	}
      }
      else {
	S725=1;
	active[13]=1;
	ends[13]=1;
	tdone[13]=1;
      }
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S1555){
      case 0 : 
	S1555=0;
	break RUN;
      case 1 : 
	S1555=2;
	bufferNotFull_12.setClear();
	bufferNotEmpty_12.setClear();
	requestData_12.setClear();
	toBuffer_12.setClear();
	fromBuffer_12.setClear();
	thread1993358169(tdone,ends);
	thread1990664927(tdone,ends);
	thread1990280178(tdone,ends);
	int biggest1997975156 = 0;
	if(ends[13]>=biggest1997975156){
	  biggest1997975156=ends[13];
	}
	if(ends[14]>=biggest1997975156){
	  biggest1997975156=ends[14];
	}
	if(ends[15]>=biggest1997975156){
	  biggest1997975156=ends[15];
	}
	if(biggest1997975156 == 1){
	  active[12]=1;
	  ends[12]=1;
	  break RUN;
	}
      case 2 : 
	bufferNotFull_12.setClear();
	bufferNotEmpty_12.setClear();
	requestData_12.setClear();
	toBuffer_12.setClear();
	fromBuffer_12.setClear();
	thread1999129403(tdone,ends);
	thread1684789552(tdone,ends);
	thread1683250556(tdone,ends);
	int biggest1690945534 = 0;
	if(ends[13]>=biggest1690945534){
	  biggest1690945534=ends[13];
	}
	if(ends[14]>=biggest1690945534){
	  biggest1690945534=ends[14];
	}
	if(ends[15]>=biggest1690945534){
	  biggest1690945534=ends[15];
	}
	if(biggest1690945534 == 1){
	  active[12]=1;
	  ends[12]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1690945534 == 0){
	  S1555=0;
	  active[12]=0;
	  ends[12]=0;
	  S1555=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bufferNotFull_12 = new Signal();
    bufferNotEmpty_12 = new Signal();
    requestData_12 = new Signal();
    toBuffer_12 = new Signal();
    fromBuffer_12 = new Signal();
    // --------------------------------------------------
  }
  int tick =0;
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
	producerChannel_in.update_r_s();
	consumerChannel_o.update_w_r();
	if(!df){
	  producerChannel_in.gethook();
	  consumerChannel_o.gethook();
	  df = true;
	}
	Native.count(((0x1<<25)|0x7));
	runClockDomain();
	++tick;
	Native.count(0x7);
	Native.count(((0x1<<25)|(0x1<<26)|0x7));
	int eot = Native.hc(0x0);
	int fmc = Native.hc(0x1);
	int mmc = Native.hc(0x2);
	int foc = Native.hc(0x3);
	int moc = Native.hc(0x4);
	System.err.println("VAL Buffers,"+(tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      bufferNotFull_12.setpreclear();
      bufferNotEmpty_12.setpreclear();
      requestData_12.setpreclear();
      toBuffer_12.setpreclear();
      fromBuffer_12.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      bufferNotFull_12.setClear();
      bufferNotEmpty_12.setClear();
      requestData_12.setClear();
      toBuffer_12.setClear();
      fromBuffer_12.setClear();
      producerChannel_in.sethook();
      consumerChannel_o.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
	producerChannel_in.gethook();
	consumerChannel_o.gethook();
      }
      if(active[12] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
