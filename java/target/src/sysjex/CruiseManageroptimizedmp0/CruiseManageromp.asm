start NOOP ;starting the program
  LDR R0 #0;
  SSVOP R0;
  LDR R1 #0 ; Setting all the output signals statuses to zero
  STR R1 $1 ;Storing the statuses of all the output signals in to the dedicated mem space for outputsignals
  LDR R1 #0
  STR R1 $2 ; Setting internal signals to zero
  LDR R1 #0 ; storing zero to pre-insigs
  STR R1 $3
  LDR R1 #0 ; storing zero to pre-osigs
  STR R1 $4
  LDR R1 #0 ;storing zero to pre-dsigs
  STR R1 $5 ;Storing them into the mem
  LDR R0 #0
  STR R0 $6; Terminate Node stored 0
  LDR R0 #0
  STR R0 $7; Terminate Node stored 1
  LDR R0 #0
  STR R0 $8; Terminate Node stored 2
  LDR R0 #case634800 ;
  STR R0 $9; Switch Node 
  LDR R0 #case634803 ;
  STR R0 $a; Switch Node 
  LDR R0 #case634805 ;
  STR R0 $b; Switch Node 
  LDR R0 #case634807 ;
  STR R0 $c; Switch Node 
  LDR R0 #case634812 ;
  STR R0 $d; Switch Node 
  LDR R0 #case634814 ;
  STR R0 $e; Switch Node 
  LDR R0 #case634818 ;
  STR R0 $f; Switch Node 
  LDR R0 #case634820 ;
  STR R0 $10; Switch Node 
  LDR R0 #case634822 ;
  STR R0 $11; Switch Node 
  LDR R0 #case634824 ;
  STR R0 $12; Switch Node 
  LDR R0 #case634826 ;
  STR R0 $13; Switch Node 
  LDR R0 #case634828 ;
  STR R0 $14; Switch Node 
  LDR R0 #case634830 ;
  STR R0 $15; Switch Node 
  LDR R0 #case634832 ;
  STR R0 $16; Switch Node 
  LDR R0 #case634834 ;
  STR R0 $17; Switch Node 
  LDR R0 #case634836 ;
  STR R0 $18; Switch Node 
  LDR R0 #case634838 ;
  STR R0 $19; Switch Node 
  LDR R0 #case634840 ;
  STR R0 $1a; Switch Node 
  LDR R0 #case634842 ;
  STR R0 $1b; Switch Node 
  LDR R0 #case634845 ;
  STR R0 $1c; Switch Node 
  LDR R0 #case634847 ;
  STR R0 $1d; Switch Node 
  LDR R0 #case634849 ;
  STR R0 $1e; Switch Node 
  LDR R0 #case634851 ;
  STR R0 $1f; Switch Node 
  LDR R0 #case634853 ;
  STR R0 $20; Switch Node 
  LDR R0 #case634855 ;
  STR R0 $21; Switch Node 
  LDR R0 #case634857 ;
  STR R0 $22; Switch Node 
  LDR R0 #case634859 ;
  STR R0 $23; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
  SEOT634863 CLFZ;
    LDR R0 #0;clearing 
    LDR R1 #0;clearing 
    LDR R11 #0;clearing (This register will always contain zeroes !)
  LERR634863  LER R0;loading the EREADY bit which is set from ENV
    PRESENT R0 LERR634863;
  FER634863 SEOT; This is basically the SEOT tick
    CER;clear the EREADY bit
    LDR R0 $0001; loading the output signals
    AND R1 R0 #$ffff;clearing output sig fields
    STR R1 $1
    AND R0 R0 #$0;
    SSOP R0;throwing output signals to env
  ; Updating pre sigs - Delayed semantics 
    STR R0 $4 ;store it to pre-osig of this CD 
    LDR R0 $2; loading signals
    STR R0 $5; storing to delayed
    ;Setting the declared signals and terminate node to 0
  STR R11 $2 ; DSigs
  LSIP R0;getting input signals from SIP
    AND R0 R0 #$0;
    LDR R1 $0000;
    AND R2 R1 #$0;
    STR R2 $3; storing insigs to delayed
  AND R1 R1 #$ffff;
    OR R0 R0 R1;
    STR R0 $0000;storing SIP signals in mem
    LDR R0 #$8000
    DCALLBL R0 ; casenumber 0
  CEOT;now start processing
  RUN0 NOOP; the locks need to be inside the memory since if they are here then I am just eating up logic
    STR R11 $6; storing zero to this CD's Terminate Node
    STR R11 $7; storing zero to this CD's Terminate Node
    STR R11 $8; storing zero to this CD's Terminate Node
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
    LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case634799 NOOP; Switch Child branch
  LDR R0 #case634799
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS6347320
case634800 NOOP; Switch Child branch
  LDR R0 #case634801
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case634801
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case634802
  STR R0 $a; EnterNode storing statecode : 0
  LDR R0 #case634805
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal off_1 in mem
    LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal set_1 in mem
    LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  LDR R0 #case634806
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case634812
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  LDR R0 #case634813
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case634818
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #case634820
  STR R0 $10; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case634822
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case634859
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63486801
N63486801 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY634868;
DUMMY634868
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63486901
  SUBV R1 R0 #1
  PRESENT R1 N63486911
N63486901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY634869;
N63486911 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY634869;
DUMMY634869
  JMP ENDS6347321
case634801 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case634802 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2 ;Got the exact signal
  PRESENT R0 else634872 ;checking if the signal is present testt1_1
  LDR R0 #case634803
  STR R0 $a; EnterNode storing statecode : 1
  JMP END0; Jumping to END
  JMP OVERELSE634873
else634872 NOOP
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case634804 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS160
case634805 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case634806 NOOP; Switch Child branch
  LDR R0 #case634806
  STR R0 $c; EnterNode storing statecode : 0
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R0 #case634807
  STR R0 $c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS150
case634807 NOOP; Switch Child branch
  LDR R0 #case634807
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R0 #case634808
  STR R0 $c; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS151
case634808 NOOP; Switch Child branch
  LDR R0 #case634808
  STR R0 $c; EnterNode storing statecode : 2
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  LDR R0 #case634809
  STR R0 $c; EnterNode storing statecode : 3
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS152
case634809 NOOP; Switch Child branch
  LDR R0 #case634809
  STR R0 $c; EnterNode storing statecode : 3
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2 ;loading the emit signal in
  STR R0 $2; emitted signal testt1_1 in mem
    LDR R0 #case634810
  STR R0 $c; EnterNode storing statecode : 4
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS153
case634810 NOOP; Switch Child branch
  LDR R0 #case634810
  STR R0 $c; EnterNode storing statecode : 4
  LDR R0 #case634804
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS154
ENDS150 NOOP 
ENDS151 NOOP 
ENDS152 NOOP 
ENDS153 NOOP 
ENDS154 NOOP 
  JMP ENDS161
ENDS160 NOOP 
ENDS161 NOOP 
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case634811 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS180
case634812 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case634813 NOOP; Switch Child branch
  LDR R0 #case634813
  STR R0 $e; EnterNode storing statecode : 0
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  LDR R0 #case634814
  STR R0 $e; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS170
case634814 NOOP; Switch Child branch
  LDR R0 #case634814
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #case634815
  STR R0 $e; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS171
case634815 NOOP; Switch Child branch
  LDR R0 #case634815
  STR R0 $e; EnterNode storing statecode : 2
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  LDR R0 #case634816
  STR R0 $e; EnterNode storing statecode : 3
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS172
case634816 NOOP; Switch Child branch
  LDR R0 #case634816
  STR R0 $e; EnterNode storing statecode : 3
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  LDR R0 #case634811
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS173
ENDS170 NOOP 
ENDS171 NOOP 
ENDS172 NOOP 
ENDS173 NOOP 
  JMP ENDS181
ENDS180 NOOP 
ENDS181 NOOP 
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case634817 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS6347290
case634818 NOOP; Switch Child branch
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case634819 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS410
case634820 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #32768; Anding to get the right signal bit set_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #16384; Anding to get the right signal bit off_1
  PRESENT R0 FALSE634894; testing whether it is true - LogicalOr
  OR R2 R2 #32; result is true - LogicalOr
FALSE634894 PRESENT R1 FALSE634895; testing whether it is true - LogicalOr 
  OR R2 R2 #32; result is true - LogicalOr
FALSE634895
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #8192; Anding to get the right signal bit resume_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #32; bitwise AND
  PRESENT R0 FALSE634896; testing whether it is true - LogicalOr
  OR R2 R2 #16; result is true - LogicalOr
FALSE634896 PRESENT R1 FALSE634897; testing whether it is true - LogicalOr 
  OR R2 R2 #16; result is true - LogicalOr
FALSE634897
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #16; bitwise AND
  PRESENT R0 FALSE634898; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE634898 PRESENT R1 FALSE634899; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE634899
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE634900; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE634900 PRESENT R1 FALSE634901; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE634901
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE634902; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE634902 PRESENT R1 FALSE634903; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE634903
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #512; Anding to get the right signal bit clock_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE634904; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE634904 PRESENT R1 FALSE634905; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE634905
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else634893 ;checking if the signal is present off_1.getprestatus() || set_1.getprestatus() || resume_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus() || brakePressed_1.getprestatus() || clock_1.getprestatus()
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634906
else634893 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634906 NOOP;
  JMP ENDS411
ENDS410 NOOP 
ENDS411 NOOP 
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case634821 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS6347050
case634822 NOOP; Switch Child branch
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case634823 NOOP; Switch Child branch
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #case634824
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  PRESENT R0 else634910 ; Checking DATACALL result 
  LDR R0 #case634825
  STR R0 $13; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal zregulOff_1 in mem
    LDR R0 #case634827
  STR R0 $14; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634911
else634910 NOOP
  LDR R0 #case634826
  STR R0 $13; EnterNode storing statecode : 1
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  PRESENT R0 else634912 ; Checking DATACALL result 
  LDR R0 #case634831
  STR R0 $16; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal regulSet_1 in mem
    LDR R0 #case634833
  STR R0 $17; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634913
else634912 NOOP
  LDR R0 #case634832
  STR R0 $16; EnterNode storing statecode : 1
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  PRESENT R0 else634914 ; Checking DATACALL result 
  LDR R0 #case634837
  STR R0 $19; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #64 ;loading the emit signal in
  STR R0 $2; emitted signal regulStdby_1 in mem
    LDR R0 #case634839
  STR R0 $1a; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634915
else634914 NOOP
  LDR R0 #case634838
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  PRESENT R0 else634916 ; Checking DATACALL result 
  LDR R0 #case634848
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8 ;loading the emit signal in
  STR R0 $2; emitted signal speedSet_1 in mem
    LDR R0 #case634850
  STR R0 $1f; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634917
else634916 NOOP
  LDR R0 #case634849
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  PRESENT R0 else634918 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8 ;loading the emit signal in
  STR R0 $2; emitted signal speedSet_1 in mem
    LDR R0 #case634854
  STR R0 $21; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634919
else634918 NOOP
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634919 NOOP;
OVERELSE634917 NOOP;
OVERELSE634915 NOOP;
OVERELSE634913 NOOP;
OVERELSE634911 NOOP;
  JMP ENDS117940
case634824 NOOP; Switch Child branch
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case634825 NOOP; Switch Child branch
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case634827 NOOP; Switch Child branch
  LDR R0 #case634827
  STR R0 $14; EnterNode storing statecode : 0
  LDR R0 #case634828
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 #case634829
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634923 ;checking if the signal is present off_1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634924 ;checking if the signal is present off_1
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  PRESENT R0 else634925 ; Checking DATACALL result 
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634926
else634925 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634926 NOOP;
  JMP OVERELSE634927
else634924 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634927 NOOP;
  JMP OVERELSE634928
else634923 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634928 NOOP;
  JMP ENDS420
case634828 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case634829 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634931 ;checking if the signal is present off_1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634932 ;checking if the signal is present off_1
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  PRESENT R0 else634933 ; Checking DATACALL result 
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634934
else634933 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634934 NOOP;
  JMP OVERELSE634935
else634932 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634935 NOOP;
  JMP OVERELSE634936
else634931 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634936 NOOP;
  JMP ENDS620
case634830 NOOP; Switch Child branch
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #case634829
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634938 ;checking if the signal is present off_1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634939 ;checking if the signal is present off_1
  LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  PRESENT R0 else634940 ; Checking DATACALL result 
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634941
else634940 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634941 NOOP;
  JMP OVERELSE634942
else634939 NOOP
  LDR R0 #case634830
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634942 NOOP;
  JMP OVERELSE634943
else634938 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634943 NOOP;
  JMP ENDS621
ENDS620 NOOP 
ENDS621 NOOP 
  JMP ENDS421
ENDS420 NOOP 
ENDS421 NOOP 
  JMP ENDS59170
case634826 NOOP; Switch Child branch
    LDR R0 $16
  JMP R0 ; SwitchNode unconditional jump
case634831 NOOP; Switch Child branch
    LDR R0 $17
  JMP R0 ; SwitchNode unconditional jump
case634833 NOOP; Switch Child branch
  LDR R0 #case634833
  STR R0 $17; EnterNode storing statecode : 0
  LDR R0 #case634834
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 #case634835
  STR R0 $18; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE634948; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE634948 PRESENT R1 FALSE634949; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE634949
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE634950; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE634950 PRESENT R1 FALSE634951; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE634951
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE634952; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE634952 PRESENT R1 FALSE634953; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE634953
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE634954; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE634954 PRESENT R1 FALSE634955; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE634955
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else634947 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else634956 ;checking if the signal is present set_1
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634957
else634956 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634958 ;checking if the signal is present off_1
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  PRESENT R0 else634959 ; Checking DATACALL result 
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634960
else634959 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634960 NOOP;
  JMP OVERELSE634961
else634958 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else634962 ;checking if the signal is present brakePressed_1
  LDR R0 #32804 ; loading case number
  DCALLBL R0 ; casenumber 36
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634963
else634962 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else634964 ;checking if the signal is present quickAccel_1
  LDR R0 #32805 ; loading case number
  DCALLBL R0 ; casenumber 37
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634965
else634964 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else634966 ;checking if the signal is present quickDecel_1
  LDR R0 #32806 ; loading case number
  DCALLBL R0 ; casenumber 38
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634967
else634966 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634967 NOOP;
OVERELSE634965 NOOP;
OVERELSE634963 NOOP;
OVERELSE634961 NOOP;
OVERELSE634957 NOOP;
  JMP OVERELSE634968
else634947 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634968 NOOP;
  JMP ENDS1650
case634834 NOOP; Switch Child branch
    LDR R0 $18
  JMP R0 ; SwitchNode unconditional jump
case634835 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE634972; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE634972 PRESENT R1 FALSE634973; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE634973
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE634974; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE634974 PRESENT R1 FALSE634975; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE634975
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE634976; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE634976 PRESENT R1 FALSE634977; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE634977
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE634978; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE634978 PRESENT R1 FALSE634979; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE634979
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else634971 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else634980 ;checking if the signal is present set_1
  LDR R0 #32807 ; loading case number
  DCALLBL R0 ; casenumber 39
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634981
else634980 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else634982 ;checking if the signal is present off_1
  LDR R0 #32809 ; loading case number
  DCALLBL R0 ; casenumber 41
  LDR R0 #32810 ; loading case number
  DCALLBL R0 ; casenumber 42
  PRESENT R0 else634983 ; Checking DATACALL result 
  LDR R0 #32811 ; loading case number
  DCALLBL R0 ; casenumber 43
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634984
else634983 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634984 NOOP;
  JMP OVERELSE634985
else634982 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else634986 ;checking if the signal is present brakePressed_1
  LDR R0 #32812 ; loading case number
  DCALLBL R0 ; casenumber 44
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634987
else634986 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else634988 ;checking if the signal is present quickAccel_1
  LDR R0 #32813 ; loading case number
  DCALLBL R0 ; casenumber 45
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634989
else634988 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else634990 ;checking if the signal is present quickDecel_1
  LDR R0 #32814 ; loading case number
  DCALLBL R0 ; casenumber 46
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE634991
else634990 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634991 NOOP;
OVERELSE634989 NOOP;
OVERELSE634987 NOOP;
OVERELSE634985 NOOP;
OVERELSE634981 NOOP;
  JMP OVERELSE634992
else634971 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE634992 NOOP;
  JMP ENDS2090
case634836 NOOP; Switch Child branch
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R0 #case634835
  STR R0 $18; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE634995; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE634995 PRESENT R1 FALSE634996; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE634996
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE634997; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE634997 PRESENT R1 FALSE634998; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE634998
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE634999; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE634999 PRESENT R1 FALSE635000; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635000
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635001; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635001 PRESENT R1 FALSE635002; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635002
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else634994 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635003 ;checking if the signal is present set_1
  LDR R0 #32815 ; loading case number
  DCALLBL R0 ; casenumber 47
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635004
else635003 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635005 ;checking if the signal is present off_1
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  LDR R0 #32818 ; loading case number
  DCALLBL R0 ; casenumber 50
  PRESENT R0 else635006 ; Checking DATACALL result 
  LDR R0 #32819 ; loading case number
  DCALLBL R0 ; casenumber 51
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635007
else635006 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635007 NOOP;
  JMP OVERELSE635008
else635005 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635009 ;checking if the signal is present brakePressed_1
  LDR R0 #32820 ; loading case number
  DCALLBL R0 ; casenumber 52
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635010
else635009 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635011 ;checking if the signal is present quickAccel_1
  LDR R0 #32821 ; loading case number
  DCALLBL R0 ; casenumber 53
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635012
else635011 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635013 ;checking if the signal is present quickDecel_1
  LDR R0 #32822 ; loading case number
  DCALLBL R0 ; casenumber 54
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635014
else635013 NOOP
  LDR R0 #case634836
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635014 NOOP;
OVERELSE635012 NOOP;
OVERELSE635010 NOOP;
OVERELSE635008 NOOP;
OVERELSE635004 NOOP;
  JMP OVERELSE635015
else634994 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635015 NOOP;
  JMP ENDS2091
ENDS2090 NOOP 
ENDS2091 NOOP 
  JMP ENDS1651
ENDS1650 NOOP 
ENDS1651 NOOP 
  JMP ENDS59160
case634832 NOOP; Switch Child branch
    LDR R0 $19
  JMP R0 ; SwitchNode unconditional jump
case634837 NOOP; Switch Child branch
    LDR R0 $1a
  JMP R0 ; SwitchNode unconditional jump
case634839 NOOP; Switch Child branch
  LDR R0 #case634839
  STR R0 $1a; EnterNode storing statecode : 0
  LDR R0 #case634840
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R0 #case634841
  STR R0 $1b; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635020; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635020 PRESENT R1 FALSE635021; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635021
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #8192; Anding to get the right signal bit resume_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635022; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635022 PRESENT R1 FALSE635023; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635023
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635019 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || resume_1.getprestatus())
  LDR R0 #case634842
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635024 ;checking if the signal is present set_1
  LDR R0 #32823 ; loading case number
  DCALLBL R0 ; casenumber 55
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635025
else635024 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635026 ;checking if the signal is present off_1
  LDR R0 #32825 ; loading case number
  DCALLBL R0 ; casenumber 57
  LDR R0 #32826 ; loading case number
  DCALLBL R0 ; casenumber 58
  PRESENT R0 else635027 ; Checking DATACALL result 
  LDR R0 #32827 ; loading case number
  DCALLBL R0 ; casenumber 59
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635028
else635027 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635028 NOOP;
  JMP OVERELSE635029
else635026 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else635030 ;checking if the signal is present resume_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16 ;loading the emit signal in
  STR R0 $2; emitted signal regulResume_1 in mem
    LDR R0 #case634844
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635031
else635030 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635031 NOOP;
OVERELSE635029 NOOP;
OVERELSE635025 NOOP;
  JMP OVERELSE635032
else635019 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635032 NOOP;
  JMP ENDS4320
case634840 NOOP; Switch Child branch
    LDR R0 $1b
  JMP R0 ; SwitchNode unconditional jump
case634841 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635036; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635036 PRESENT R1 FALSE635037; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635037
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #8192; Anding to get the right signal bit resume_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635038; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635038 PRESENT R1 FALSE635039; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635039
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635035 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || resume_1.getprestatus())
  LDR R0 #case634842
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635040 ;checking if the signal is present set_1
  LDR R0 #32828 ; loading case number
  DCALLBL R0 ; casenumber 60
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635041
else635040 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635042 ;checking if the signal is present off_1
  LDR R0 #32830 ; loading case number
  DCALLBL R0 ; casenumber 62
  LDR R0 #32831 ; loading case number
  DCALLBL R0 ; casenumber 63
  PRESENT R0 else635043 ; Checking DATACALL result 
  LDR R0 #32832 ; loading case number
  DCALLBL R0 ; casenumber 64
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635044
else635043 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635044 NOOP;
  JMP OVERELSE635045
else635042 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else635046 ;checking if the signal is present resume_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16 ;loading the emit signal in
  STR R0 $2; emitted signal regulResume_1 in mem
    LDR R0 #case634844
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635047
else635046 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635047 NOOP;
OVERELSE635045 NOOP;
OVERELSE635041 NOOP;
  JMP OVERELSE635048
else635035 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635048 NOOP;
  JMP ENDS12560
case634842 NOOP; Switch Child branch
    LDR R0 $1c
  JMP R0 ; SwitchNode unconditional jump
case634844 NOOP; Switch Child branch
  LDR R0 #case634844
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R0 #case634845
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R0 #case634846
  STR R0 $1d; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635052; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635052 PRESENT R1 FALSE635053; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635053
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635054; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635054 PRESENT R1 FALSE635055; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635055
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635056; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635056 PRESENT R1 FALSE635057; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635057
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635058; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635058 PRESENT R1 FALSE635059; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635059
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635051 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635060 ;checking if the signal is present set_1
  LDR R0 #32833 ; loading case number
  DCALLBL R0 ; casenumber 65
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635061
else635060 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635062 ;checking if the signal is present off_1
  LDR R0 #32835 ; loading case number
  DCALLBL R0 ; casenumber 67
  LDR R0 #32836 ; loading case number
  DCALLBL R0 ; casenumber 68
  PRESENT R0 else635063 ; Checking DATACALL result 
  LDR R0 #32837 ; loading case number
  DCALLBL R0 ; casenumber 69
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635064
else635063 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635064 NOOP;
  JMP OVERELSE635065
else635062 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635066 ;checking if the signal is present brakePressed_1
  LDR R0 #32838 ; loading case number
  DCALLBL R0 ; casenumber 70
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635067
else635066 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635068 ;checking if the signal is present quickAccel_1
  LDR R0 #32839 ; loading case number
  DCALLBL R0 ; casenumber 71
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635069
else635068 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635070 ;checking if the signal is present quickDecel_1
  LDR R0 #32840 ; loading case number
  DCALLBL R0 ; casenumber 72
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635071
else635070 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635071 NOOP;
OVERELSE635069 NOOP;
OVERELSE635067 NOOP;
OVERELSE635065 NOOP;
OVERELSE635061 NOOP;
  JMP OVERELSE635072
else635051 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635072 NOOP;
  JMP ENDS4400
case634845 NOOP; Switch Child branch
    LDR R0 $1d
  JMP R0 ; SwitchNode unconditional jump
case634846 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635076; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635076 PRESENT R1 FALSE635077; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635077
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635078; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635078 PRESENT R1 FALSE635079; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635079
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635080; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635080 PRESENT R1 FALSE635081; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635081
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635082; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635082 PRESENT R1 FALSE635083; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635083
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635075 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635084 ;checking if the signal is present set_1
  LDR R0 #32841 ; loading case number
  DCALLBL R0 ; casenumber 73
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635085
else635084 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635086 ;checking if the signal is present off_1
  LDR R0 #32843 ; loading case number
  DCALLBL R0 ; casenumber 75
  LDR R0 #32844 ; loading case number
  DCALLBL R0 ; casenumber 76
  PRESENT R0 else635087 ; Checking DATACALL result 
  LDR R0 #32845 ; loading case number
  DCALLBL R0 ; casenumber 77
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635088
else635087 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635088 NOOP;
  JMP OVERELSE635089
else635086 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635090 ;checking if the signal is present brakePressed_1
  LDR R0 #32846 ; loading case number
  DCALLBL R0 ; casenumber 78
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635091
else635090 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635092 ;checking if the signal is present quickAccel_1
  LDR R0 #32847 ; loading case number
  DCALLBL R0 ; casenumber 79
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635093
else635092 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635094 ;checking if the signal is present quickDecel_1
  LDR R0 #32848 ; loading case number
  DCALLBL R0 ; casenumber 80
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635095
else635094 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635095 NOOP;
OVERELSE635093 NOOP;
OVERELSE635091 NOOP;
OVERELSE635089 NOOP;
OVERELSE635085 NOOP;
  JMP OVERELSE635096
else635075 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635096 NOOP;
  JMP ENDS4840
case634847 NOOP; Switch Child branch
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R0 #case634846
  STR R0 $1d; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635099; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635099 PRESENT R1 FALSE635100; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635100
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635101; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635101 PRESENT R1 FALSE635102; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635102
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635103; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635103 PRESENT R1 FALSE635104; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635104
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635105; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635105 PRESENT R1 FALSE635106; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635106
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635098 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635107 ;checking if the signal is present set_1
  LDR R0 #32849 ; loading case number
  DCALLBL R0 ; casenumber 81
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635108
else635107 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635109 ;checking if the signal is present off_1
  LDR R0 #32851 ; loading case number
  DCALLBL R0 ; casenumber 83
  LDR R0 #32852 ; loading case number
  DCALLBL R0 ; casenumber 84
  PRESENT R0 else635110 ; Checking DATACALL result 
  LDR R0 #32853 ; loading case number
  DCALLBL R0 ; casenumber 85
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635111
else635110 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635111 NOOP;
  JMP OVERELSE635112
else635109 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635113 ;checking if the signal is present brakePressed_1
  LDR R0 #32854 ; loading case number
  DCALLBL R0 ; casenumber 86
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635114
else635113 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635115 ;checking if the signal is present quickAccel_1
  LDR R0 #32855 ; loading case number
  DCALLBL R0 ; casenumber 87
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635116
else635115 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635117 ;checking if the signal is present quickDecel_1
  LDR R0 #32856 ; loading case number
  DCALLBL R0 ; casenumber 88
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635118
else635117 NOOP
  LDR R0 #case634847
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635118 NOOP;
OVERELSE635116 NOOP;
OVERELSE635114 NOOP;
OVERELSE635112 NOOP;
OVERELSE635108 NOOP;
  JMP OVERELSE635119
else635098 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635119 NOOP;
  JMP ENDS4841
ENDS4840 NOOP 
ENDS4841 NOOP 
  JMP ENDS4401
ENDS4400 NOOP 
ENDS4401 NOOP 
  JMP ENDS12561
case634843 NOOP; Switch Child branch
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R0 #case634841
  STR R0 $1b; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635122; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635122 PRESENT R1 FALSE635123; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635123
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #8192; Anding to get the right signal bit resume_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635124; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635124 PRESENT R1 FALSE635125; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635125
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635121 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || resume_1.getprestatus())
  LDR R0 #case634842
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635126 ;checking if the signal is present set_1
  LDR R0 #32857 ; loading case number
  DCALLBL R0 ; casenumber 89
  LDR R0 #32858 ; loading case number
  DCALLBL R0 ; casenumber 90
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635127
else635126 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635128 ;checking if the signal is present off_1
  LDR R0 #32859 ; loading case number
  DCALLBL R0 ; casenumber 91
  LDR R0 #32860 ; loading case number
  DCALLBL R0 ; casenumber 92
  PRESENT R0 else635129 ; Checking DATACALL result 
  LDR R0 #32861 ; loading case number
  DCALLBL R0 ; casenumber 93
  LDR R0 #32858 ; loading case number
  DCALLBL R0 ; casenumber 90
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635130
else635129 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635130 NOOP;
  JMP OVERELSE635131
else635128 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else635132 ;checking if the signal is present resume_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16 ;loading the emit signal in
  STR R0 $2; emitted signal regulResume_1 in mem
    LDR R0 #case634844
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635133
else635132 NOOP
  LDR R0 #case634843
  STR R0 $1b; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635133 NOOP;
OVERELSE635131 NOOP;
OVERELSE635127 NOOP;
  JMP OVERELSE635134
else635121 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635134 NOOP;
  JMP ENDS12562
ENDS12560 NOOP 
ENDS12561 NOOP 
ENDS12562 NOOP 
  JMP ENDS4321
ENDS4320 NOOP 
ENDS4321 NOOP 
  JMP ENDS59150
case634838 NOOP; Switch Child branch
    LDR R0 $1e
  JMP R0 ; SwitchNode unconditional jump
case634848 NOOP; Switch Child branch
    LDR R0 $1f
  JMP R0 ; SwitchNode unconditional jump
case634850 NOOP; Switch Child branch
  LDR R0 #case634850
  STR R0 $1f; EnterNode storing statecode : 0
  LDR R0 #case634851
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R0 #case634852
  STR R0 $20; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635139; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635139 PRESENT R1 FALSE635140; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635140
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635141; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635141 PRESENT R1 FALSE635142; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635142
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635143; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635143 PRESENT R1 FALSE635144; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635144
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635145; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635145 PRESENT R1 FALSE635146; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635146
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635138 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635147 ;checking if the signal is present set_1
  LDR R0 #32862 ; loading case number
  DCALLBL R0 ; casenumber 94
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635148
else635147 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635149 ;checking if the signal is present off_1
  LDR R0 #32864 ; loading case number
  DCALLBL R0 ; casenumber 96
  LDR R0 #32865 ; loading case number
  DCALLBL R0 ; casenumber 97
  PRESENT R0 else635150 ; Checking DATACALL result 
  LDR R0 #32866 ; loading case number
  DCALLBL R0 ; casenumber 98
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635151
else635150 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635151 NOOP;
  JMP OVERELSE635152
else635149 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635153 ;checking if the signal is present brakePressed_1
  LDR R0 #32867 ; loading case number
  DCALLBL R0 ; casenumber 99
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635154
else635153 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635155 ;checking if the signal is present quickAccel_1
  LDR R0 #32868 ; loading case number
  DCALLBL R0 ; casenumber 100
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635156
else635155 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635157 ;checking if the signal is present quickDecel_1
  LDR R0 #32869 ; loading case number
  DCALLBL R0 ; casenumber 101
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635158
else635157 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635158 NOOP;
OVERELSE635156 NOOP;
OVERELSE635154 NOOP;
OVERELSE635152 NOOP;
OVERELSE635148 NOOP;
  JMP OVERELSE635159
else635138 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635159 NOOP;
  JMP ENDS53790
case634851 NOOP; Switch Child branch
    LDR R0 $20
  JMP R0 ; SwitchNode unconditional jump
case634852 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635163; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635163 PRESENT R1 FALSE635164; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635164
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635165; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635165 PRESENT R1 FALSE635166; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635166
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635167; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635167 PRESENT R1 FALSE635168; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635168
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635169; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635169 PRESENT R1 FALSE635170; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635170
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635162 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635171 ;checking if the signal is present set_1
  LDR R0 #32870 ; loading case number
  DCALLBL R0 ; casenumber 102
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635172
else635171 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635173 ;checking if the signal is present off_1
  LDR R0 #32872 ; loading case number
  DCALLBL R0 ; casenumber 104
  LDR R0 #32873 ; loading case number
  DCALLBL R0 ; casenumber 105
  PRESENT R0 else635174 ; Checking DATACALL result 
  LDR R0 #32874 ; loading case number
  DCALLBL R0 ; casenumber 106
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635175
else635174 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635175 NOOP;
  JMP OVERELSE635176
else635173 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635177 ;checking if the signal is present brakePressed_1
  LDR R0 #32875 ; loading case number
  DCALLBL R0 ; casenumber 107
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635178
else635177 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635179 ;checking if the signal is present quickAccel_1
  LDR R0 #32876 ; loading case number
  DCALLBL R0 ; casenumber 108
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635180
else635179 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635181 ;checking if the signal is present quickDecel_1
  LDR R0 #32877 ; loading case number
  DCALLBL R0 ; casenumber 109
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635182
else635181 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635182 NOOP;
OVERELSE635180 NOOP;
OVERELSE635178 NOOP;
OVERELSE635176 NOOP;
OVERELSE635172 NOOP;
  JMP OVERELSE635183
else635162 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635183 NOOP;
  JMP ENDS54230
case634853 NOOP; Switch Child branch
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R0 #case634852
  STR R0 $20; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635186; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635186 PRESENT R1 FALSE635187; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635187
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635188; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635188 PRESENT R1 FALSE635189; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635189
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635190; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635190 PRESENT R1 FALSE635191; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635191
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635192; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635192 PRESENT R1 FALSE635193; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635193
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635185 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635194 ;checking if the signal is present set_1
  LDR R0 #32878 ; loading case number
  DCALLBL R0 ; casenumber 110
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635195
else635194 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635196 ;checking if the signal is present off_1
  LDR R0 #32880 ; loading case number
  DCALLBL R0 ; casenumber 112
  LDR R0 #32881 ; loading case number
  DCALLBL R0 ; casenumber 113
  PRESENT R0 else635197 ; Checking DATACALL result 
  LDR R0 #32882 ; loading case number
  DCALLBL R0 ; casenumber 114
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635198
else635197 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635198 NOOP;
  JMP OVERELSE635199
else635196 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635200 ;checking if the signal is present brakePressed_1
  LDR R0 #32883 ; loading case number
  DCALLBL R0 ; casenumber 115
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635201
else635200 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635202 ;checking if the signal is present quickAccel_1
  LDR R0 #32884 ; loading case number
  DCALLBL R0 ; casenumber 116
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635203
else635202 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635204 ;checking if the signal is present quickDecel_1
  LDR R0 #32885 ; loading case number
  DCALLBL R0 ; casenumber 117
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635205
else635204 NOOP
  LDR R0 #case634853
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635205 NOOP;
OVERELSE635203 NOOP;
OVERELSE635201 NOOP;
OVERELSE635199 NOOP;
OVERELSE635195 NOOP;
  JMP OVERELSE635206
else635185 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635206 NOOP;
  JMP ENDS54231
ENDS54230 NOOP 
ENDS54231 NOOP 
  JMP ENDS53791
ENDS53790 NOOP 
ENDS53791 NOOP 
  JMP ENDS59140
case634849 NOOP; Switch Child branch
    LDR R0 $21
  JMP R0 ; SwitchNode unconditional jump
case634854 NOOP; Switch Child branch
  LDR R0 #case634854
  STR R0 $21; EnterNode storing statecode : 0
  LDR R0 #case634855
  STR R0 $21; EnterNode storing statecode : 1
  LDR R0 #case634856
  STR R0 $22; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635210; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635210 PRESENT R1 FALSE635211; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635211
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635212; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635212 PRESENT R1 FALSE635213; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635213
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635214; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635214 PRESENT R1 FALSE635215; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635215
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635216; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635216 PRESENT R1 FALSE635217; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635217
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635209 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635218 ;checking if the signal is present set_1
  LDR R0 #32886 ; loading case number
  DCALLBL R0 ; casenumber 118
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635219
else635218 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635220 ;checking if the signal is present off_1
  LDR R0 #32888 ; loading case number
  DCALLBL R0 ; casenumber 120
  LDR R0 #32889 ; loading case number
  DCALLBL R0 ; casenumber 121
  PRESENT R0 else635221 ; Checking DATACALL result 
  LDR R0 #32890 ; loading case number
  DCALLBL R0 ; casenumber 122
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635222
else635221 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635222 NOOP;
  JMP OVERELSE635223
else635220 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635224 ;checking if the signal is present brakePressed_1
  LDR R0 #32891 ; loading case number
  DCALLBL R0 ; casenumber 123
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635225
else635224 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635226 ;checking if the signal is present quickAccel_1
  LDR R0 #32892 ; loading case number
  DCALLBL R0 ; casenumber 124
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635227
else635226 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635228 ;checking if the signal is present quickDecel_1
  LDR R0 #32893 ; loading case number
  DCALLBL R0 ; casenumber 125
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635229
else635228 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635229 NOOP;
OVERELSE635227 NOOP;
OVERELSE635225 NOOP;
OVERELSE635223 NOOP;
OVERELSE635219 NOOP;
  JMP OVERELSE635230
else635209 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635230 NOOP;
  JMP ENDS56460
case634855 NOOP; Switch Child branch
    LDR R0 $22
  JMP R0 ; SwitchNode unconditional jump
case634856 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635234; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635234 PRESENT R1 FALSE635235; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635235
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635236; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635236 PRESENT R1 FALSE635237; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635237
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635238; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635238 PRESENT R1 FALSE635239; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635239
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635240; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635240 PRESENT R1 FALSE635241; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635241
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635233 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635242 ;checking if the signal is present set_1
  LDR R0 #32894 ; loading case number
  DCALLBL R0 ; casenumber 126
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635243
else635242 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635244 ;checking if the signal is present off_1
  LDR R0 #32896 ; loading case number
  DCALLBL R0 ; casenumber 128
  LDR R0 #32897 ; loading case number
  DCALLBL R0 ; casenumber 129
  PRESENT R0 else635245 ; Checking DATACALL result 
  LDR R0 #32898 ; loading case number
  DCALLBL R0 ; casenumber 130
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635246
else635245 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635246 NOOP;
  JMP OVERELSE635247
else635244 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635248 ;checking if the signal is present brakePressed_1
  LDR R0 #32899 ; loading case number
  DCALLBL R0 ; casenumber 131
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635249
else635248 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635250 ;checking if the signal is present quickAccel_1
  LDR R0 #32900 ; loading case number
  DCALLBL R0 ; casenumber 132
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635251
else635250 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635252 ;checking if the signal is present quickDecel_1
  LDR R0 #32901 ; loading case number
  DCALLBL R0 ; casenumber 133
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635253
else635252 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635253 NOOP;
OVERELSE635251 NOOP;
OVERELSE635249 NOOP;
OVERELSE635247 NOOP;
OVERELSE635243 NOOP;
  JMP OVERELSE635254
else635233 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635254 NOOP;
  JMP ENDS56900
case634857 NOOP; Switch Child branch
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R0 #case634856
  STR R0 $22; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit off_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit set_1
  PRESENT R0 FALSE635257; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635257 PRESENT R1 FALSE635258; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635258
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #1024; Anding to get the right signal bit brakePressed_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635259; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635259 PRESENT R1 FALSE635260; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635260
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #4096; Anding to get the right signal bit quickAccel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635261; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635261 PRESENT R1 FALSE635262; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635262
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #2048; Anding to get the right signal bit quickDecel_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635263; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635263 PRESENT R1 FALSE635264; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635264
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635256 ;checking if the signal is present (set_1.getprestatus() || off_1.getprestatus() || brakePressed_1.getprestatus() || quickAccel_1.getprestatus() || quickDecel_1.getprestatus())
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else635265 ;checking if the signal is present set_1
  LDR R0 #32902 ; loading case number
  DCALLBL R0 ; casenumber 134
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635266
else635265 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else635267 ;checking if the signal is present off_1
  LDR R0 #32904 ; loading case number
  DCALLBL R0 ; casenumber 136
  LDR R0 #32905 ; loading case number
  DCALLBL R0 ; casenumber 137
  PRESENT R0 else635268 ; Checking DATACALL result 
  LDR R0 #32906 ; loading case number
  DCALLBL R0 ; casenumber 138
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635269
else635268 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635269 NOOP;
  JMP OVERELSE635270
else635267 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else635271 ;checking if the signal is present brakePressed_1
  LDR R0 #32907 ; loading case number
  DCALLBL R0 ; casenumber 139
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635272
else635271 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else635273 ;checking if the signal is present quickAccel_1
  LDR R0 #32908 ; loading case number
  DCALLBL R0 ; casenumber 140
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635274
else635273 NOOP
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else635275 ;checking if the signal is present quickDecel_1
  LDR R0 #32909 ; loading case number
  DCALLBL R0 ; casenumber 141
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  LDR R0 #case634823
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635276
else635275 NOOP
  LDR R0 #case634857
  STR R0 $22; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635276 NOOP;
OVERELSE635274 NOOP;
OVERELSE635272 NOOP;
OVERELSE635270 NOOP;
OVERELSE635266 NOOP;
  JMP OVERELSE635277
else635256 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635277 NOOP;
  JMP ENDS56901
ENDS56900 NOOP 
ENDS56901 NOOP 
  JMP ENDS56461
ENDS56460 NOOP 
ENDS56461 NOOP 
  JMP ENDS59141
ENDS59140 NOOP 
ENDS59141 NOOP 
  JMP ENDS59151
ENDS59150 NOOP 
ENDS59151 NOOP 
  JMP ENDS59161
ENDS59160 NOOP 
ENDS59161 NOOP 
  JMP ENDS59171
ENDS59170 NOOP 
ENDS59171 NOOP 
  JMP ENDS117941
ENDS117940 NOOP 
ENDS117941 NOOP 
  JMP ENDS6347051
ENDS6347050 NOOP 
ENDS6347051 NOOP 
    LDR R0 $23
  JMP R0 ; SwitchNode unconditional jump
case634858 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS6347270
case634859 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #64; Anding to get the right signal bit regulStdby_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #128; Anding to get the right signal bit zregulOff_1
  PRESENT R0 FALSE635281; testing whether it is true - LogicalOr
  OR R2 R2 #8; result is true - LogicalOr
FALSE635281 PRESENT R1 FALSE635282; testing whether it is true - LogicalOr 
  OR R2 R2 #8; result is true - LogicalOr
FALSE635282
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #32; Anding to get the right signal bit regulSet_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #8; bitwise AND
  PRESENT R0 FALSE635283; testing whether it is true - LogicalOr
  OR R2 R2 #4; result is true - LogicalOr
FALSE635283 PRESENT R1 FALSE635284; testing whether it is true - LogicalOr 
  OR R2 R2 #4; result is true - LogicalOr
FALSE635284
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #16; Anding to get the right signal bit regulResume_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #4; bitwise AND
  PRESENT R0 FALSE635285; testing whether it is true - LogicalOr
  OR R2 R2 #2; result is true - LogicalOr
FALSE635285 PRESENT R1 FALSE635286; testing whether it is true - LogicalOr 
  OR R2 R2 #2; result is true - LogicalOr
FALSE635286
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #8; Anding to get the right signal bit speedSet_1
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results 
   AND R0 R0 #2; bitwise AND
  PRESENT R0 FALSE635287; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE635287 PRESENT R1 FALSE635288; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE635288
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else635280 ;checking if the signal is present zregulOff_1.getprestatus() || regulStdby_1.getprestatus() || regulSet_1.getprestatus() || regulResume_1.getprestatus() || speedSet_1.getprestatus()
  LDR R0 #32910 ; loading case number
  DCALLBL R0 ; casenumber 142
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635289
else635280 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE635289 NOOP;
  JMP ENDS6347271
ENDS6347270 NOOP 
ENDS6347271 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63529001
  SUBV R1 R0 #0
  PRESENT R1 N6352900
N63529001 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY635290;
N6352900 NOOP 
  LDR R0 #case634817
  STR R0 $f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY635290;
DUMMY635290
  JMP ENDS6347291
ENDS6347290 NOOP 
ENDS6347291 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63529101
  SUBV R1 R0 #0
  PRESENT R1 N6352910
N63529101 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY635291;
N6352910 NOOP 
  LDR R0 #case634803
  STR R0 $a; EnterNode storing statecode : 1
  JMP END0; Jumping to END
  JMP DUMMY635291;
DUMMY635291
OVERELSE634873 NOOP;
  JMP ENDS6347310
case634803 NOOP; Switch Child branch
  LDR R0 #case634803
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 #case634799
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case634799
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS6347311
ENDS6347310 NOOP 
ENDS6347311 NOOP 
  JMP ENDS6347322
ENDS6347320 NOOP 
ENDS6347321 NOOP 
ENDS6347322 NOOP 
END0 JMP BEGIN0
    ENDPROG
  