start NOOP ;starting the program
  LDR R0 #0;
  SSVOP R0;
  LDR R1 #0 ; Setting all the output signals statuses to zero
  STR R1 $1 ;Storing the statuses of all the output signals in to the dedicated mem space for outputsignals
  LDR R1 #0
  STR R1 $2 ; Setting internal signals to zero
  LDR R1 #0
  STR R1 $3 ; Setting internal signals to zero
  LDR R1 #0 ; storing zero to pre-insigs
  STR R1 $4
  LDR R1 #0 ; storing zero to pre-osigs
  STR R1 $5
  LDR R1 #0 ;storing zero to pre-dsigs
  STR R1 $6 ;Storing them into the mem
  LDR R1 #0 ;storing zero to pre-dsigs
  STR R1 $7 ;Storing them into the mem
  LDR R0 #0
  STR R0 $8; Terminate Node stored 0
  LDR R0 #0
  STR R0 $9; Terminate Node stored 1
  LDR R0 #0
  STR R0 $a; Terminate Node stored 2
  LDR R0 #0
  STR R0 $b; Terminate Node stored 3
  LDR R0 #0
  STR R0 $c; Terminate Node stored 4
  LDR R0 #case21907 ;
  STR R0 $d; Switch Node 
  LDR R0 #case21910 ;
  STR R0 $e; Switch Node 
  LDR R0 #case21912 ;
  STR R0 $f; Switch Node 
  LDR R0 #case21914 ;
  STR R0 $10; Switch Node 
  LDR R0 #case21916 ;
  STR R0 $11; Switch Node 
  LDR R0 #case21918 ;
  STR R0 $12; Switch Node 
  LDR R0 #case21921 ;
  STR R0 $13; Switch Node 
  LDR R0 #case21925 ;
  STR R0 $14; Switch Node 
  LDR R0 #case21927 ;
  STR R0 $15; Switch Node 
  LDR R0 #case21933 ;
  STR R0 $16; Switch Node 
  LDR R0 #case21937 ;
  STR R0 $17; Switch Node 
  LDR R0 #case21939 ;
  STR R0 $18; Switch Node 
  LDR R0 #case21942 ;
  STR R0 $19; Switch Node 
  LDR R0 #case21944 ;
  STR R0 $1a; Switch Node 
  LDR R0 #case21950 ;
  STR R0 $1b; Switch Node 
  LDR R0 #case21952 ;
  STR R0 $1c; Switch Node 
  LDR R0 #case21961 ;
  STR R0 $1d; Switch Node 
  LDR R0 #case21967 ;
  STR R0 $1e; Switch Node 
  LDR R0 #case21969 ;
  STR R0 $1f; Switch Node 
  LDR R0 #case21971 ;
  STR R0 $20; Switch Node 
  LDR R0 #case21975 ;
  STR R0 $21; Switch Node 
  LDR R0 #case21978 ;
  STR R0 $22; Switch Node 
  LDR R0 #case21980 ;
  STR R0 $23; Switch Node 
  LDR R0 #case21982 ;
  STR R0 $24; Switch Node 
  LDR R0 #case21984 ;
  STR R0 $25; Switch Node 
  LDR R0 #case21986 ;
  STR R0 $26; Switch Node 
  LDR R0 #case21988 ;
  STR R0 $27; Switch Node 
  LDR R0 #case21990 ;
  STR R0 $28; Switch Node 
  LDR R0 #case21992 ;
  STR R0 $29; Switch Node 
  LDR R0 #case21994 ;
  STR R0 $2a; Switch Node 
  LDR R0 #case21996 ;
  STR R0 $2b; Switch Node 
  LDR R0 #case21998 ;
  STR R0 $2c; Switch Node 
  LDR R0 #case22000 ;
  STR R0 $2d; Switch Node 
  LDR R0 #case22002 ;
  STR R0 $2e; Switch Node 
  LDR R0 #case22004 ;
  STR R0 $2f; Switch Node 
  LDR R0 #case22006 ;
  STR R0 $30; Switch Node 
  LDR R0 #case22009 ;
  STR R0 $31; Switch Node 
  LDR R0 #case22011 ;
  STR R0 $32; Switch Node 
  LDR R0 #case22013 ;
  STR R0 $33; Switch Node 
  LDR R0 #case22015 ;
  STR R0 $34; Switch Node 
  LDR R0 #case22018 ;
  STR R0 $35; Switch Node 
  LDR R0 #case22020 ;
  STR R0 $36; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT22021 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR22021  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR22021;
FER22021 SEOT; This is basically the SEOT tick
  CER;clear the EREADY bit
  LDR R0 $0001; loading the output signals
  AND R1 R0 #$ffff;clearing output sig fields
  STR R1 $1
  AND R0 R0 #$0;
  SSOP R0;throwing output signals to env
; Updating pre sigs - Delayed semantics 
  STR R0 $5 ;store it to pre-osig of this CD 
  LDR R0 $2; loading signals
  STR R0 $6; storing to delayed
  LDR R0 $3; loading signals
  STR R0 $7; storing to delayed
;Setting the declared signals and terminate node to 0
  STR R11 $2 ; DSigs
  STR R11 $3 ; DSigs
  LSIP R0;getting input signals from SIP
  AND R0 R0 #$0;
  LDR R1 $0000;
  AND R2 R1 #$0;
  STR R2 $4; storing insigs to delayed
  AND R1 R1 #$ffff;
  OR R0 R0 R1;
  STR R0 $0000;storing SIP signals in mem
  LDR R0 #$8000
  DCALLBL R0 ; casenumber 0
  CEOT;now start processing
RUN0 NOOP; the locks need to be inside the memory since if they are here then I am just eating up logic
  STR R11 $8; storing zero to this CD's Terminate Node
  STR R11 $9; storing zero to this CD's Terminate Node
  STR R11 $a; storing zero to this CD's Terminate Node
  STR R11 $b; storing zero to this CD's Terminate Node
  STR R11 $c; storing zero to this CD's Terminate Node
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
  LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case21906 NOOP; Switch Child branch
  LDR R0 #case21906
  STR R0 $d; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS217860
case21907 NOOP; Switch Child branch
  LDR R0 #case21908
  STR R0 $d; EnterNode storing statecode : 2
  LDR R0 #case21908
  STR R0 $d; EnterNode storing statecode : 2
  LDR R0 #case21910
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #case21912
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case21913
  STR R0 $10; EnterNode storing statecode : 0
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  PRESENT R0 else22026 ; Checking DATACALL result 
  LDR R0 #case21915
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal EntryRequest_1 in mem
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  LDR R0 #case21917
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
    JMP OVERELSE22027
else22026 NOOP
  LDR R0 #case21916
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal EntryRequest_1 in mem
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #case21920
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22027 NOOP;
  LDR R0 #case21937
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R0 #case21938
  STR R0 $18; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  LDR R0 $a; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2202801
N2202801 NOOP 
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22028;
DUMMY22028
  LDR R0 #case21967
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R0 #case21969
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R0 #case21970
  STR R0 $20; EnterNode storing statecode : 0
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  LDR R0 #case21974
  STR R0 $21; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  LDR R0 #case21992
  STR R0 $29; EnterNode storing statecode : 1
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  LDR R0 #case21993
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #case21995
  STR R0 $2b; EnterNode storing statecode : 0
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  PRESENT R0 else22030 ; Checking DATACALL result 
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  LDR R0 #case21996
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22031
else22030 NOOP
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  PRESENT R0 else22032 ; Checking DATACALL result 
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  PRESENT R0 else22033 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1 ;loading the emit signal in
  STR R0 $2; emitted signal Preempt_5 in mem
    LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22034
else22033 NOOP
  LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22034 NOOP;
  JMP OVERELSE22035
else22032 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22035 NOOP;
OVERELSE22031 NOOP;
  LDR R0 #case21998
  STR R0 $2c; EnterNode storing statecode : 1
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  LDR R0 #case21999
  STR R0 $2d; EnterNode storing statecode : 0
  LDR R0 #case22001
  STR R0 $2e; EnterNode storing statecode : 0
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  PRESENT R0 else22036 ; Checking DATACALL result 
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  LDR R0 #case22002
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22037
else22036 NOOP
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  PRESENT R0 else22038 ; Checking DATACALL result 
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  PRESENT R0 else22039 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2 ;loading the emit signal in
  STR R0 $2; emitted signal RAC_5 in mem
    LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22040
else22039 NOOP
  LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22040 NOOP;
  JMP OVERELSE22041
else22038 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22041 NOOP;
OVERELSE22037 NOOP;
  LDR R0 #case22004
  STR R0 $2f; EnterNode storing statecode : 1
  LDR R0 #case22005
  STR R0 $30; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  LDR R0 #case22013
  STR R0 $33; EnterNode storing statecode : 1
  LDR R0 #case22014
  STR R0 $34; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  LDR R0 $a; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2204201
N2204201 NOOP 
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22042;
DUMMY22042
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2204301
  SUBV R1 R0 #1
  PRESENT R1 N2204311
N2204301 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY22043;
N2204311 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY22043;
DUMMY22043
  JMP ENDS217861
case21908 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case21909 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS2580
case21910 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case21911 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS980
case21912 NOOP; Switch Child branch
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case21913 NOOP; Switch Child branch
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case21915 NOOP; Switch Child branch
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case21917 NOOP; Switch Child branch
  LDR R0 #case21917
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #case21918
  STR R0 $12; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS130
case21918 NOOP; Switch Child branch
  LDR R0 #case21918
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #case21919
  STR R0 $12; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS131
case21919 NOOP; Switch Child branch
  LDR R0 #case21919
  STR R0 $12; EnterNode storing statecode : 2
  LDR R0 #case21914
  STR R0 $10; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS132
ENDS130 NOOP 
ENDS131 NOOP 
ENDS132 NOOP 
  JMP ENDS250
case21916 NOOP; Switch Child branch
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case21920 NOOP; Switch Child branch
  LDR R0 #case21920
  STR R0 $13; EnterNode storing statecode : 0
  LDR R0 #case21921
  STR R0 $13; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS140
case21921 NOOP; Switch Child branch
  LDR R0 #case21921
  STR R0 $13; EnterNode storing statecode : 1
  LDR R0 #case21922
  STR R0 $13; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS141
case21922 NOOP; Switch Child branch
  LDR R0 #case21922
  STR R0 $13; EnterNode storing statecode : 2
  LDR R0 #case21923
  STR R0 $13; EnterNode storing statecode : 3
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  PRESENT R0 else22060 ; Checking DATACALL result 
  LDR R0 #case21924
  STR R0 $14; EnterNode storing statecode : 0
  LDR R0 #case21926
  STR R0 $15; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22061
else22060 NOOP
  LDR R0 #case21925
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal DoorOpened_1 in mem
    LDR R0 #case21932
  STR R0 $16; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22061 NOOP;
  JMP ENDS142
case21923 NOOP; Switch Child branch
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case21924 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case21926 NOOP; Switch Child branch
  LDR R0 #case21926
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #case21927
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS150
case21927 NOOP; Switch Child branch
  LDR R0 #case21927
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #case21928
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS151
case21928 NOOP; Switch Child branch
  LDR R0 #case21928
  STR R0 $15; EnterNode storing statecode : 2
  LDR R0 #case21929
  STR R0 $15; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS152
case21929 NOOP; Switch Child branch
  LDR R0 #case21929
  STR R0 $15; EnterNode storing statecode : 3
  LDR R0 #case21930
  STR R0 $15; EnterNode storing statecode : 4
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS153
case21930 NOOP; Switch Child branch
  LDR R0 #case21930
  STR R0 $15; EnterNode storing statecode : 4
  LDR R0 #case21931
  STR R0 $15; EnterNode storing statecode : 5
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS154
case21931 NOOP; Switch Child branch
  LDR R0 #case21931
  STR R0 $15; EnterNode storing statecode : 5
  LDR R0 #case21914
  STR R0 $10; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS155
ENDS150 NOOP 
ENDS151 NOOP 
ENDS152 NOOP 
ENDS153 NOOP 
ENDS154 NOOP 
ENDS155 NOOP 
  JMP ENDS190
case21925 NOOP; Switch Child branch
    LDR R0 $16
  JMP R0 ; SwitchNode unconditional jump
case21932 NOOP; Switch Child branch
  LDR R0 #case21932
  STR R0 $16; EnterNode storing statecode : 0
  LDR R0 #case21933
  STR R0 $16; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS160
case21933 NOOP; Switch Child branch
  LDR R0 #case21933
  STR R0 $16; EnterNode storing statecode : 1
  LDR R0 #case21934
  STR R0 $16; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS161
case21934 NOOP; Switch Child branch
  LDR R0 #case21934
  STR R0 $16; EnterNode storing statecode : 2
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16 ;loading the emit signal in
  STR R0 $2; emitted signal s1_1 in mem
    LDR R0 #case21935
  STR R0 $16; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS162
case21935 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #8 ;Got the exact signal
  PRESENT R0 else22075 ;checking if the signal is present s2_1
  LDR R0 #case21914
  STR R0 $10; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22076
else22075 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22076 NOOP;
  JMP ENDS163
ENDS160 NOOP 
ENDS161 NOOP 
ENDS162 NOOP 
ENDS163 NOOP 
  JMP ENDS191
ENDS190 NOOP 
ENDS191 NOOP 
  JMP ENDS143
ENDS140 NOOP 
ENDS141 NOOP 
ENDS142 NOOP 
ENDS143 NOOP 
  JMP ENDS251
ENDS250 NOOP 
ENDS251 NOOP 
  JMP ENDS260
case21914 NOOP; Switch Child branch
  LDR R0 #case21914
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #case21913
  STR R0 $10; EnterNode storing statecode : 0
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  PRESENT R0 else22078 ; Checking DATACALL result 
  LDR R0 #case21915
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal EntryRequest_1 in mem
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  LDR R0 #case21917
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
    JMP OVERELSE22079
else22078 NOOP
  LDR R0 #case21916
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal EntryRequest_1 in mem
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  LDR R0 #case21920
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22079 NOOP;
  JMP ENDS261
ENDS260 NOOP 
ENDS261 NOOP 
  JMP ENDS981
ENDS980 NOOP 
ENDS981 NOOP 
    LDR R0 $17
  JMP R0 ; SwitchNode unconditional jump
case21936 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS2560
case21937 NOOP; Switch Child branch
    LDR R0 $18
  JMP R0 ; SwitchNode unconditional jump
case21938 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #16 ;Got the exact signal
  PRESENT R0 else22083 ;checking if the signal is present s1_1
  LDR R0 #case21939
  STR R0 $18; EnterNode storing statecode : 1
  LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  PRESENT R0 else22084 ; Checking DATACALL result 
  LDR R0 #case21941
  STR R0 $19; EnterNode storing statecode : 0
  LDR R0 #case21943
  STR R0 $1a; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22085
else22084 NOOP
  LDR R0 #case21942
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  PRESENT R0 else22086 ; Checking DATACALL result 
  LDR R0 #case21949
  STR R0 $1b; EnterNode storing statecode : 0
  LDR R0 #case21951
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22087
else22086 NOOP
  LDR R0 #case21950
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  PRESENT R0 else22088 ; Checking DATACALL result 
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal EntryRegistered_1 in mem
    LDR R0 #case21960
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22089
else22088 NOOP
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal ExitRegistered_1 in mem
    LDR R0 #case21960
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22089 NOOP;
OVERELSE22087 NOOP;
OVERELSE22085 NOOP;
  JMP OVERELSE22090
else22083 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22090 NOOP;
  JMP ENDS1250
case21939 NOOP; Switch Child branch
    LDR R0 $19
  JMP R0 ; SwitchNode unconditional jump
case21941 NOOP; Switch Child branch
    LDR R0 $1a
  JMP R0 ; SwitchNode unconditional jump
case21943 NOOP; Switch Child branch
  LDR R0 #case21943
  STR R0 $1a; EnterNode storing statecode : 0
  LDR R0 #case21944
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1010
case21944 NOOP; Switch Child branch
  LDR R0 #case21944
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R0 #case21945
  STR R0 $1a; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1011
case21945 NOOP; Switch Child branch
  LDR R0 #case21945
  STR R0 $1a; EnterNode storing statecode : 2
  LDR R0 #case21946
  STR R0 $1a; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1012
case21946 NOOP; Switch Child branch
  LDR R0 #case21946
  STR R0 $1a; EnterNode storing statecode : 3
  LDR R0 #case21947
  STR R0 $1a; EnterNode storing statecode : 4
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1013
case21947 NOOP; Switch Child branch
  LDR R0 #case21947
  STR R0 $1a; EnterNode storing statecode : 4
  LDR R0 #case21948
  STR R0 $1a; EnterNode storing statecode : 5
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1014
case21948 NOOP; Switch Child branch
  LDR R0 #case21948
  STR R0 $1a; EnterNode storing statecode : 5
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8 ;loading the emit signal in
  STR R0 $2; emitted signal s2_1 in mem
    LDR R0 #case21940
  STR R0 $18; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1015
ENDS1010 NOOP 
ENDS1011 NOOP 
ENDS1012 NOOP 
ENDS1013 NOOP 
ENDS1014 NOOP 
ENDS1015 NOOP 
  JMP ENDS1120
case21942 NOOP; Switch Child branch
    LDR R0 $1b
  JMP R0 ; SwitchNode unconditional jump
case21949 NOOP; Switch Child branch
    LDR R0 $1c
  JMP R0 ; SwitchNode unconditional jump
case21951 NOOP; Switch Child branch
  LDR R0 #case21951
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R0 #case21952
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1020
case21952 NOOP; Switch Child branch
  LDR R0 #case21952
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R0 #case21953
  STR R0 $1c; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1021
case21953 NOOP; Switch Child branch
  LDR R0 #case21953
  STR R0 $1c; EnterNode storing statecode : 2
  LDR R0 #case21954
  STR R0 $1c; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1022
case21954 NOOP; Switch Child branch
  LDR R0 #case21954
  STR R0 $1c; EnterNode storing statecode : 3
  LDR R0 #case21955
  STR R0 $1c; EnterNode storing statecode : 4
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1023
case21955 NOOP; Switch Child branch
  LDR R0 #case21955
  STR R0 $1c; EnterNode storing statecode : 4
  LDR R0 #case21956
  STR R0 $1c; EnterNode storing statecode : 5
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1024
case21956 NOOP; Switch Child branch
  LDR R0 #case21956
  STR R0 $1c; EnterNode storing statecode : 5
  LDR R0 #case21957
  STR R0 $1c; EnterNode storing statecode : 6
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1025
case21957 NOOP; Switch Child branch
  LDR R0 #case21957
  STR R0 $1c; EnterNode storing statecode : 6
  LDR R0 #case21958
  STR R0 $1c; EnterNode storing statecode : 7
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1026
case21958 NOOP; Switch Child branch
  LDR R0 #case21958
  STR R0 $1c; EnterNode storing statecode : 7
  LDR R0 #case21959
  STR R0 $1c; EnterNode storing statecode : 8
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1027
case21959 NOOP; Switch Child branch
  LDR R0 #case21959
  STR R0 $1c; EnterNode storing statecode : 8
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal DoorClosed_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #8 ;loading the emit signal in
  STR R0 $2; emitted signal s2_1 in mem
    LDR R0 #case21940
  STR R0 $18; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1028
ENDS1020 NOOP 
ENDS1021 NOOP 
ENDS1022 NOOP 
ENDS1023 NOOP 
ENDS1024 NOOP 
ENDS1025 NOOP 
ENDS1026 NOOP 
ENDS1027 NOOP 
ENDS1028 NOOP 
  JMP ENDS1100
case21950 NOOP; Switch Child branch
    LDR R0 $1d
  JMP R0 ; SwitchNode unconditional jump
case21960 NOOP; Switch Child branch
  LDR R0 #case21960
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R0 #case21961
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1090
case21961 NOOP; Switch Child branch
  LDR R0 #case21961
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R0 #case21962
  STR R0 $1d; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1091
case21962 NOOP; Switch Child branch
  LDR R0 #case21962
  STR R0 $1d; EnterNode storing statecode : 2
  LDR R0 #case21963
  STR R0 $1d; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1092
case21963 NOOP; Switch Child branch
  LDR R0 #case21963
  STR R0 $1d; EnterNode storing statecode : 3
  LDR R0 #case21964
  STR R0 $1d; EnterNode storing statecode : 4
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1093
case21964 NOOP; Switch Child branch
  LDR R0 #case21964
  STR R0 $1d; EnterNode storing statecode : 4
  LDR R0 #case21965
  STR R0 $1d; EnterNode storing statecode : 5
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1094
case21965 NOOP; Switch Child branch
  LDR R0 #case21965
  STR R0 $1d; EnterNode storing statecode : 5
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal DoorClosed_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #8 ;loading the emit signal in
  STR R0 $2; emitted signal s2_1 in mem
    LDR R0 #case21940
  STR R0 $18; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1095
ENDS1090 NOOP 
ENDS1091 NOOP 
ENDS1092 NOOP 
ENDS1093 NOOP 
ENDS1094 NOOP 
ENDS1095 NOOP 
  JMP ENDS1101
ENDS1100 NOOP 
ENDS1101 NOOP 
  JMP ENDS1121
ENDS1120 NOOP 
ENDS1121 NOOP 
  JMP ENDS1251
case21940 NOOP; Switch Child branch
  LDR R0 #case21940
  STR R0 $18; EnterNode storing statecode : 2
  LDR R0 #case21938
  STR R0 $18; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS1252
ENDS1250 NOOP 
ENDS1251 NOOP 
ENDS1252 NOOP 
  JMP ENDS2561
ENDS2560 NOOP 
ENDS2561 NOOP 
  LDR R0 $a; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2211801
  SUBV R1 R0 #0
  PRESENT R1 N221180
N2211801 NOOP 
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22118;
N221180 NOOP 
  LDR R0 #case21909
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22118;
DUMMY22118
  JMP ENDS2581
ENDS2580 NOOP 
ENDS2581 NOOP 
    LDR R0 $1e
  JMP R0 ; SwitchNode unconditional jump
case21966 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS217840
case21967 NOOP; Switch Child branch
    LDR R0 $1f
  JMP R0 ; SwitchNode unconditional jump
case21968 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS105050
case21969 NOOP; Switch Child branch
    LDR R0 $20
  JMP R0 ; SwitchNode unconditional jump
case21970 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #1 ;Got the exact signal
  PRESENT R0 else22125 ;checking if the signal is present Preempt_5
  LDR R0 #case21971
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22126
else22125 NOOP
    LDR R0 $21
  JMP R0 ; SwitchNode unconditional jump
case21974 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $6; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #32768; Anding to get the right signal bit ExitRequest_1
  LDR R0 $6; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32; Anding to get the right signal bit EntryRequest_1
  PRESENT R0 FALSE22129; testing whether it is true - LogicalAnd
  PRESENT R1 FALSE22129; testing whether it is true - LogicalAnd
  OR R2 R2 #1; result is true - LogicalAnd
FALSE22129
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else22128 ;checking if the signal is present EntryRequest_1.getprestatus() && ExitRequest_1.getprestatus()
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22130
else22128 NOOP
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $6; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #32768; Anding to get the right signal bit ExitRequest_1
  LDR R0 $6; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #32; Anding to get the right signal bit EntryRequest_1
  PRESENT R0 FALSE22132; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE22132 PRESENT R1 FALSE22133; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE22133
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else22131 ;checking if the signal is present EntryRequest_1.getprestatus() || ExitRequest_1.getprestatus()
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #32 ;Got the exact signal
  PRESENT R0 else22134 ;checking if the signal is present EntryRequest_1
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case21975
  STR R0 $21; EnterNode storing statecode : 1
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  PRESENT R0 else22135 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal UnlockDoor_1 in mem
    LDR R0 #case21977
  STR R0 $22; EnterNode storing statecode : 0
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  PRESENT R0 else22136 ; Checking DATACALL result 
  LDR R0 #32804 ; loading case number
  DCALLBL R0 ; casenumber 36
  LDR R0 #32805 ; loading case number
  DCALLBL R0 ; casenumber 37
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22137
else22136 NOOP
  LDR R0 #32806 ; loading case number
  DCALLBL R0 ; casenumber 38
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22137 NOOP;
  JMP OVERELSE22138
else22135 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal InvalidCard_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22138 NOOP;
  JMP OVERELSE22139
else22134 NOOP
  LDR R0 #32807 ; loading case number
  DCALLBL R0 ; casenumber 39
  LDR R0 #case21975
  STR R0 $21; EnterNode storing statecode : 1
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  PRESENT R0 else22140 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal UnlockDoor_1 in mem
    LDR R0 #case21977
  STR R0 $22; EnterNode storing statecode : 0
  LDR R0 #32809 ; loading case number
  DCALLBL R0 ; casenumber 41
  LDR R0 #32810 ; loading case number
  DCALLBL R0 ; casenumber 42
  PRESENT R0 else22141 ; Checking DATACALL result 
  LDR R0 #32811 ; loading case number
  DCALLBL R0 ; casenumber 43
  LDR R0 #32812 ; loading case number
  DCALLBL R0 ; casenumber 44
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22142
else22141 NOOP
  LDR R0 #32813 ; loading case number
  DCALLBL R0 ; casenumber 45
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22142 NOOP;
  JMP OVERELSE22143
else22140 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal InvalidCard_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22143 NOOP;
OVERELSE22139 NOOP;
  JMP OVERELSE22144
else22131 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22144 NOOP;
OVERELSE22130 NOOP;
  JMP ENDS2690
case21975 NOOP; Switch Child branch
    LDR R0 $22
  JMP R0 ; SwitchNode unconditional jump
case21977 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else22147 ;checking if the signal is present DoorOpened_1
  LDR R0 #case21978
  STR R0 $22; EnterNode storing statecode : 1
  LDR R0 #case21980
  STR R0 $23; EnterNode storing statecode : 1
  LDR R0 #case21982
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $c
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $c
  LDR R0 #case21984
  STR R0 $25; EnterNode storing statecode : 1
  LDR R1 $c
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $c
  LDR R0 $c; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2215001
N2215001 NOOP 
  LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP DUMMY22150;
DUMMY22150
  LDR R0 #case21986
  STR R0 $26; EnterNode storing statecode : 1
  LDR R0 #32818 ; loading case number
  DCALLBL R0 ; casenumber 50
  LDR R0 #case21987
  STR R0 $27; EnterNode storing statecode : 0
  LDR R0 #32819 ; loading case number
  DCALLBL R0 ; casenumber 51
  PRESENT R0 else22151 ; Checking DATACALL result 
  LDR R0 #32820 ; loading case number
  DCALLBL R0 ; casenumber 52
  LDR R0 #case21988
  STR R0 $27; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4 ;loading the emit signal in
  STR R0 $2; emitted signal beep_5 in mem
    LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP OVERELSE22152
else22151 NOOP
  LDR R0 #32821 ; loading case number
  DCALLBL R0 ; casenumber 53
  LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
OVERELSE22152 NOOP;
  LDR R0 $b; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2215301
N2215301 NOOP 
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP DUMMY22153;
DUMMY22153
  JMP OVERELSE22154
else22147 NOOP
  LDR R0 #32814 ; loading case number
  DCALLBL R0 ; casenumber 46
  PRESENT R0 else22155 ; Checking DATACALL result 
  LDR R0 #32815 ; loading case number
  DCALLBL R0 ; casenumber 47
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22156
else22155 NOOP
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22156 NOOP;
OVERELSE22154 NOOP;
  JMP ENDS3600
case21978 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else22158 ;checking if the signal is present DoorClosed_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22159
else22158 NOOP
    LDR R0 $23
  JMP R0 ; SwitchNode unconditional jump
case21979 NOOP; Switch Child branch
  LDR R1 $b
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP ENDS2930
case21980 NOOP; Switch Child branch
    LDR R0 $24
  JMP R0 ; SwitchNode unconditional jump
case21981 NOOP; Switch Child branch
  LDR R1 $c
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $c
  JMP ENDS2880
case21982 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else22166 ;checking if the signal is present EntryRegistered_1
  LDR R0 $3 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $3; emitted signal sInc_5 in mem
    LDR R0 #case21981
  STR R0 $24; EnterNode storing statecode : 0
  LDR R1 $c
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $c
  JMP OVERELSE22167
else22166 NOOP
  LDR R1 $c
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $c
OVERELSE22167 NOOP;
  JMP ENDS2881
ENDS2880 NOOP 
ENDS2881 NOOP 
    LDR R0 $25
  JMP R0 ; SwitchNode unconditional jump
case21983 NOOP; Switch Child branch
  LDR R1 $c
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $c
  JMP ENDS2910
case21984 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else22170 ;checking if the signal is present ExitRegistered_1
  LDR R0 $3 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $3; emitted signal sDec_5 in mem
    LDR R0 #case21983
  STR R0 $25; EnterNode storing statecode : 0
  LDR R1 $c
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $c
  JMP OVERELSE22171
else22170 NOOP
  LDR R1 $c
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $c
OVERELSE22171 NOOP;
  JMP ENDS2911
ENDS2910 NOOP 
ENDS2911 NOOP 
  LDR R0 $c; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2217201
  SUBV R1 R0 #0
  PRESENT R1 N221720
N2217201 NOOP 
  LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP DUMMY22172;
N221720 NOOP 
  LDR R0 #case21979
  STR R0 $23; EnterNode storing statecode : 0
  LDR R1 $b
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP DUMMY22172;
DUMMY22172
  JMP ENDS2931
ENDS2930 NOOP 
ENDS2931 NOOP 
    LDR R0 $26
  JMP R0 ; SwitchNode unconditional jump
case21985 NOOP; Switch Child branch
  LDR R1 $b
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP ENDS3210
case21986 NOOP; Switch Child branch
    LDR R0 $27
  JMP R0 ; SwitchNode unconditional jump
case21987 NOOP; Switch Child branch
  LDR R0 #32822 ; loading case number
  DCALLBL R0 ; casenumber 54
  PRESENT R0 else22176 ; Checking DATACALL result 
  LDR R0 #32823 ; loading case number
  DCALLBL R0 ; casenumber 55
  LDR R0 #case21988
  STR R0 $27; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4 ;loading the emit signal in
  STR R0 $2; emitted signal beep_5 in mem
    LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP OVERELSE22177
else22176 NOOP
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
OVERELSE22177 NOOP;
  JMP ENDS3080
case21988 NOOP; Switch Child branch
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4 ;loading the emit signal in
  STR R0 $2; emitted signal beep_5 in mem
    LDR R1 $b
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $b
  JMP ENDS3081
ENDS3080 NOOP 
ENDS3081 NOOP 
  JMP ENDS3211
ENDS3210 NOOP 
ENDS3211 NOOP 
  LDR R0 $b; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2217901
  SUBV R1 R0 #0
  PRESENT R1 N221790
N2217901 NOOP 
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP DUMMY22179;
N221790 NOOP 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP DUMMY22179;
DUMMY22179
OVERELSE22159 NOOP;
  JMP ENDS3601
ENDS3600 NOOP 
ENDS3601 NOOP 
  JMP ENDS2691
case21976 NOOP; Switch Child branch
  LDR R0 #case21976
  STR R0 $21; EnterNode storing statecode : 2
  LDR R0 #case21974
  STR R0 $21; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS2692
ENDS2690 NOOP 
ENDS2691 NOOP 
ENDS2692 NOOP 
OVERELSE22126 NOOP;
  JMP ENDS36450
case21971 NOOP; Switch Child branch
  LDR R0 #case21971
  STR R0 $20; EnterNode storing statecode : 1
  LDR R0 #case21972
  STR R0 $20; EnterNode storing statecode : 2
  LDR R0 #case21989
  STR R0 $28; EnterNode storing statecode : 0
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else22182 ;checking if the signal is present DoorClosed_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22183
else22182 NOOP
  LDR R0 #case21990
  STR R0 $28; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22183 NOOP;
  JMP ENDS36451
case21972 NOOP; Switch Child branch
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #2 ;Got the exact signal
  PRESENT R0 else22185 ;checking if the signal is present RAC_5
  LDR R0 #case21973
  STR R0 $20; EnterNode storing statecode : 3
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22186
else22185 NOOP
    LDR R0 $28
  JMP R0 ; SwitchNode unconditional jump
case21989 NOOP; Switch Child branch
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS36500
case21990 NOOP; Switch Child branch
  LDR R0 #case21990
  STR R0 $28; EnterNode storing statecode : 1
  LDR R0 #case21989
  STR R0 $28; EnterNode storing statecode : 0
  LDR R0 $6 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else22189 ;checking if the signal is present DoorClosed_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal LockDoor_1 in mem
    LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22190
else22189 NOOP
  LDR R0 #case21990
  STR R0 $28; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22190 NOOP;
  JMP ENDS36501
ENDS36500 NOOP 
ENDS36501 NOOP 
OVERELSE22186 NOOP;
  JMP ENDS36452
case21973 NOOP; Switch Child branch
  LDR R0 #case21973
  STR R0 $20; EnterNode storing statecode : 3
  LDR R0 #case21970
  STR R0 $20; EnterNode storing statecode : 0
  LDR R0 #32825 ; loading case number
  DCALLBL R0 ; casenumber 57
  LDR R0 #case21974
  STR R0 $21; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS36453
ENDS36450 NOOP 
ENDS36451 NOOP 
ENDS36452 NOOP 
ENDS36453 NOOP 
  JMP ENDS105051
ENDS105050 NOOP 
ENDS105051 NOOP 
    LDR R0 $29
  JMP R0 ; SwitchNode unconditional jump
case21991 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS106120
case21992 NOOP; Switch Child branch
    LDR R0 $2a
  JMP R0 ; SwitchNode unconditional jump
case21993 NOOP; Switch Child branch
    LDR R0 $2b
  JMP R0 ; SwitchNode unconditional jump
case21995 NOOP; Switch Child branch
  LDR R0 #32826 ; loading case number
  DCALLBL R0 ; casenumber 58
  PRESENT R0 else22196 ; Checking DATACALL result 
  LDR R0 #32831 ; loading case number
  DCALLBL R0 ; casenumber 63
  LDR R0 #case21996
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22197
else22196 NOOP
  LDR R0 #32827 ; loading case number
  DCALLBL R0 ; casenumber 59
  PRESENT R0 else22198 ; Checking DATACALL result 
  LDR R0 #32828 ; loading case number
  DCALLBL R0 ; casenumber 60
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  LDR R0 #32830 ; loading case number
  DCALLBL R0 ; casenumber 62
  PRESENT R0 else22199 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1 ;loading the emit signal in
  STR R0 $2; emitted signal Preempt_5 in mem
    LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22200
else22199 NOOP
  LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22200 NOOP;
  JMP OVERELSE22201
else22198 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22201 NOOP;
OVERELSE22197 NOOP;
  JMP ENDS105110
case21996 NOOP; Switch Child branch
  LDR R0 #case21996
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R0 #case21995
  STR R0 $2b; EnterNode storing statecode : 0
  LDR R0 #32832 ; loading case number
  DCALLBL R0 ; casenumber 64
  PRESENT R0 else22203 ; Checking DATACALL result 
  LDR R0 #32837 ; loading case number
  DCALLBL R0 ; casenumber 69
  LDR R0 #case21996
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22204
else22203 NOOP
  LDR R0 #32833 ; loading case number
  DCALLBL R0 ; casenumber 65
  PRESENT R0 else22205 ; Checking DATACALL result 
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #32835 ; loading case number
  DCALLBL R0 ; casenumber 67
  LDR R0 #32836 ; loading case number
  DCALLBL R0 ; casenumber 68
  PRESENT R0 else22206 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1 ;loading the emit signal in
  STR R0 $2; emitted signal Preempt_5 in mem
    LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22207
else22206 NOOP
  LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22207 NOOP;
  JMP OVERELSE22208
else22205 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22208 NOOP;
OVERELSE22204 NOOP;
  JMP ENDS105111
ENDS105110 NOOP 
ENDS105111 NOOP 
  JMP ENDS105360
case21994 NOOP; Switch Child branch
  LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R0 #32838 ; loading case number
  DCALLBL R0 ; casenumber 70
  LDR R0 #case21993
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #case21995
  STR R0 $2b; EnterNode storing statecode : 0
  LDR R0 #32839 ; loading case number
  DCALLBL R0 ; casenumber 71
  PRESENT R0 else22210 ; Checking DATACALL result 
  LDR R0 #32844 ; loading case number
  DCALLBL R0 ; casenumber 76
  LDR R0 #case21996
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22211
else22210 NOOP
  LDR R0 #32840 ; loading case number
  DCALLBL R0 ; casenumber 72
  PRESENT R0 else22212 ; Checking DATACALL result 
  LDR R0 #32841 ; loading case number
  DCALLBL R0 ; casenumber 73
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  LDR R0 #32843 ; loading case number
  DCALLBL R0 ; casenumber 75
  PRESENT R0 else22213 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1 ;loading the emit signal in
  STR R0 $2; emitted signal Preempt_5 in mem
    LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22214
else22213 NOOP
  LDR R0 #case21994
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22214 NOOP;
  JMP OVERELSE22215
else22212 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22215 NOOP;
OVERELSE22211 NOOP;
  JMP ENDS105361
ENDS105360 NOOP 
ENDS105361 NOOP 
  JMP ENDS106121
ENDS106120 NOOP 
ENDS106121 NOOP 
    LDR R0 $2c
  JMP R0 ; SwitchNode unconditional jump
case21997 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS107190
case21998 NOOP; Switch Child branch
    LDR R0 $2d
  JMP R0 ; SwitchNode unconditional jump
case21999 NOOP; Switch Child branch
    LDR R0 $2e
  JMP R0 ; SwitchNode unconditional jump
case22001 NOOP; Switch Child branch
  LDR R0 #32845 ; loading case number
  DCALLBL R0 ; casenumber 77
  PRESENT R0 else22220 ; Checking DATACALL result 
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 #case22002
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22221
else22220 NOOP
  LDR R0 #32846 ; loading case number
  DCALLBL R0 ; casenumber 78
  PRESENT R0 else22222 ; Checking DATACALL result 
  LDR R0 #32847 ; loading case number
  DCALLBL R0 ; casenumber 79
  LDR R0 #32848 ; loading case number
  DCALLBL R0 ; casenumber 80
  LDR R0 #32849 ; loading case number
  DCALLBL R0 ; casenumber 81
  PRESENT R0 else22223 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2 ;loading the emit signal in
  STR R0 $2; emitted signal RAC_5 in mem
    LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22224
else22223 NOOP
  LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22224 NOOP;
  JMP OVERELSE22225
else22222 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22225 NOOP;
OVERELSE22221 NOOP;
  JMP ENDS106180
case22002 NOOP; Switch Child branch
  LDR R0 #case22002
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R0 #case22001
  STR R0 $2e; EnterNode storing statecode : 0
  LDR R0 #32851 ; loading case number
  DCALLBL R0 ; casenumber 83
  PRESENT R0 else22227 ; Checking DATACALL result 
  LDR R0 #32856 ; loading case number
  DCALLBL R0 ; casenumber 88
  LDR R0 #case22002
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22228
else22227 NOOP
  LDR R0 #32852 ; loading case number
  DCALLBL R0 ; casenumber 84
  PRESENT R0 else22229 ; Checking DATACALL result 
  LDR R0 #32853 ; loading case number
  DCALLBL R0 ; casenumber 85
  LDR R0 #32854 ; loading case number
  DCALLBL R0 ; casenumber 86
  LDR R0 #32855 ; loading case number
  DCALLBL R0 ; casenumber 87
  PRESENT R0 else22230 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2 ;loading the emit signal in
  STR R0 $2; emitted signal RAC_5 in mem
    LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22231
else22230 NOOP
  LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22231 NOOP;
  JMP OVERELSE22232
else22229 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22232 NOOP;
OVERELSE22228 NOOP;
  JMP ENDS106181
ENDS106180 NOOP 
ENDS106181 NOOP 
  JMP ENDS106430
case22000 NOOP; Switch Child branch
  LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R0 #32857 ; loading case number
  DCALLBL R0 ; casenumber 89
  LDR R0 #case21999
  STR R0 $2d; EnterNode storing statecode : 0
  LDR R0 #case22001
  STR R0 $2e; EnterNode storing statecode : 0
  LDR R0 #32858 ; loading case number
  DCALLBL R0 ; casenumber 90
  PRESENT R0 else22234 ; Checking DATACALL result 
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case22002
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22235
else22234 NOOP
  LDR R0 #32859 ; loading case number
  DCALLBL R0 ; casenumber 91
  PRESENT R0 else22236 ; Checking DATACALL result 
  LDR R0 #32860 ; loading case number
  DCALLBL R0 ; casenumber 92
  LDR R0 #32861 ; loading case number
  DCALLBL R0 ; casenumber 93
  LDR R0 #32862 ; loading case number
  DCALLBL R0 ; casenumber 94
  PRESENT R0 else22237 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2 ;loading the emit signal in
  STR R0 $2; emitted signal RAC_5 in mem
    LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22238
else22237 NOOP
  LDR R0 #case22000
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22238 NOOP;
  JMP OVERELSE22239
else22236 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22239 NOOP;
OVERELSE22235 NOOP;
  JMP ENDS106431
ENDS106430 NOOP 
ENDS106431 NOOP 
  JMP ENDS107191
ENDS107190 NOOP 
ENDS107191 NOOP 
    LDR R0 $2f
  JMP R0 ; SwitchNode unconditional jump
case22003 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS108710
case22004 NOOP; Switch Child branch
    LDR R0 $30
  JMP R0 ; SwitchNode unconditional jump
case22005 NOOP; Switch Child branch
  LDR R0 $7 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else22243 ;checking if the signal is present sInc_5
  LDR R0 #case22006
  STR R0 $30; EnterNode storing statecode : 1
  LDR R0 #case22008
  STR R0 $31; EnterNode storing statecode : 0
  LDR R0 #32864 ; loading case number
  DCALLBL R0 ; casenumber 96
  PRESENT R0 else22244 ; Checking DATACALL result 
  LDR R0 #32869 ; loading case number
  DCALLBL R0 ; casenumber 101
  LDR R0 #case22009
  STR R0 $31; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22245
else22244 NOOP
  LDR R0 #case22010
  STR R0 $32; EnterNode storing statecode : 0
  LDR R0 #32865 ; loading case number
  DCALLBL R0 ; casenumber 97
  PRESENT R0 else22246 ; Checking DATACALL result 
  LDR R0 #32866 ; loading case number
  DCALLBL R0 ; casenumber 98
  LDR R0 #case22011
  STR R0 $32; EnterNode storing statecode : 1
  LDR R0 #32867 ; loading case number
  DCALLBL R0 ; casenumber 99
  PRESENT R0 else22247 ; Checking DATACALL result 
  LDR R0 #32868 ; loading case number
  DCALLBL R0 ; casenumber 100
  LDR R0 #case22007
  STR R0 $30; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22248
else22247 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22248 NOOP;
  JMP OVERELSE22249
else22246 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22249 NOOP;
OVERELSE22245 NOOP;
  JMP OVERELSE22250
else22243 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22250 NOOP;
  JMP ENDS107690
case22006 NOOP; Switch Child branch
    LDR R0 $31
  JMP R0 ; SwitchNode unconditional jump
case22008 NOOP; Switch Child branch
  LDR R0 #32870 ; loading case number
  DCALLBL R0 ; casenumber 102
  PRESENT R0 else22253 ; Checking DATACALL result 
  LDR R0 #32876 ; loading case number
  DCALLBL R0 ; casenumber 108
  LDR R0 #case22009
  STR R0 $31; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22254
else22253 NOOP
    LDR R0 $32
  JMP R0 ; SwitchNode unconditional jump
case22010 NOOP; Switch Child branch
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  PRESENT R0 else22256 ; Checking DATACALL result 
  LDR R0 #32872 ; loading case number
  DCALLBL R0 ; casenumber 104
  LDR R0 #case22011
  STR R0 $32; EnterNode storing statecode : 1
  LDR R0 #32873 ; loading case number
  DCALLBL R0 ; casenumber 105
  PRESENT R0 else22257 ; Checking DATACALL result 
  LDR R0 #32874 ; loading case number
  DCALLBL R0 ; casenumber 106
  LDR R0 #case22007
  STR R0 $30; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22258
else22257 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22258 NOOP;
  JMP OVERELSE22259
else22256 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22259 NOOP;
  JMP ENDS107240
case22011 NOOP; Switch Child branch
  LDR R0 #32875 ; loading case number
  DCALLBL R0 ; casenumber 107
  PRESENT R0 else22261 ; Checking DATACALL result 
  LDR R0 #32874 ; loading case number
  DCALLBL R0 ; casenumber 106
  LDR R0 #case22007
  STR R0 $30; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22262
else22261 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22262 NOOP;
  JMP ENDS107241
ENDS107240 NOOP 
ENDS107241 NOOP 
OVERELSE22254 NOOP;
  JMP ENDS107290
case22009 NOOP; Switch Child branch
  LDR R0 #case22009
  STR R0 $31; EnterNode storing statecode : 1
  LDR R0 #case22008
  STR R0 $31; EnterNode storing statecode : 0
  LDR R0 #32877 ; loading case number
  DCALLBL R0 ; casenumber 109
  PRESENT R0 else22264 ; Checking DATACALL result 
  LDR R0 #32882 ; loading case number
  DCALLBL R0 ; casenumber 114
  LDR R0 #case22009
  STR R0 $31; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22265
else22264 NOOP
  LDR R0 #case22010
  STR R0 $32; EnterNode storing statecode : 0
  LDR R0 #32878 ; loading case number
  DCALLBL R0 ; casenumber 110
  PRESENT R0 else22266 ; Checking DATACALL result 
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #case22011
  STR R0 $32; EnterNode storing statecode : 1
  LDR R0 #32880 ; loading case number
  DCALLBL R0 ; casenumber 112
  PRESENT R0 else22267 ; Checking DATACALL result 
  LDR R0 #32881 ; loading case number
  DCALLBL R0 ; casenumber 113
  LDR R0 #case22007
  STR R0 $30; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22268
else22267 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22268 NOOP;
  JMP OVERELSE22269
else22266 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22269 NOOP;
OVERELSE22265 NOOP;
  JMP ENDS107291
ENDS107290 NOOP 
ENDS107291 NOOP 
  JMP ENDS107691
case22007 NOOP; Switch Child branch
  LDR R0 #case22007
  STR R0 $30; EnterNode storing statecode : 2
  LDR R0 #case22005
  STR R0 $30; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS107692
ENDS107690 NOOP 
ENDS107691 NOOP 
ENDS107692 NOOP 
  JMP ENDS108711
ENDS108710 NOOP 
ENDS108711 NOOP 
    LDR R0 $33
  JMP R0 ; SwitchNode unconditional jump
case22012 NOOP; Switch Child branch
  LDR R1 $a
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS110230
case22013 NOOP; Switch Child branch
    LDR R0 $34
  JMP R0 ; SwitchNode unconditional jump
case22014 NOOP; Switch Child branch
  LDR R0 $7 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else22274 ;checking if the signal is present sDec_5
  LDR R0 #case22015
  STR R0 $34; EnterNode storing statecode : 1
  LDR R0 #case22017
  STR R0 $35; EnterNode storing statecode : 0
  LDR R0 #32883 ; loading case number
  DCALLBL R0 ; casenumber 115
  PRESENT R0 else22275 ; Checking DATACALL result 
  LDR R0 #32888 ; loading case number
  DCALLBL R0 ; casenumber 120
  LDR R0 #case22018
  STR R0 $35; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22276
else22275 NOOP
  LDR R0 #case22019
  STR R0 $36; EnterNode storing statecode : 0
  LDR R0 #32884 ; loading case number
  DCALLBL R0 ; casenumber 116
  PRESENT R0 else22277 ; Checking DATACALL result 
  LDR R0 #32885 ; loading case number
  DCALLBL R0 ; casenumber 117
  LDR R0 #case22020
  STR R0 $36; EnterNode storing statecode : 1
  LDR R0 #32886 ; loading case number
  DCALLBL R0 ; casenumber 118
  PRESENT R0 else22278 ; Checking DATACALL result 
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #case22016
  STR R0 $34; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22279
else22278 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22279 NOOP;
  JMP OVERELSE22280
else22277 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22280 NOOP;
OVERELSE22276 NOOP;
  JMP OVERELSE22281
else22274 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22281 NOOP;
  JMP ENDS109210
case22015 NOOP; Switch Child branch
    LDR R0 $35
  JMP R0 ; SwitchNode unconditional jump
case22017 NOOP; Switch Child branch
  LDR R0 #32889 ; loading case number
  DCALLBL R0 ; casenumber 121
  PRESENT R0 else22284 ; Checking DATACALL result 
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  LDR R0 #case22018
  STR R0 $35; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22285
else22284 NOOP
    LDR R0 $36
  JMP R0 ; SwitchNode unconditional jump
case22019 NOOP; Switch Child branch
  LDR R0 #32890 ; loading case number
  DCALLBL R0 ; casenumber 122
  PRESENT R0 else22287 ; Checking DATACALL result 
  LDR R0 #32891 ; loading case number
  DCALLBL R0 ; casenumber 123
  LDR R0 #case22020
  STR R0 $36; EnterNode storing statecode : 1
  LDR R0 #32892 ; loading case number
  DCALLBL R0 ; casenumber 124
  PRESENT R0 else22288 ; Checking DATACALL result 
  LDR R0 #32893 ; loading case number
  DCALLBL R0 ; casenumber 125
  LDR R0 #case22016
  STR R0 $34; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22289
else22288 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22289 NOOP;
  JMP OVERELSE22290
else22287 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22290 NOOP;
  JMP ENDS108760
case22020 NOOP; Switch Child branch
  LDR R0 #32894 ; loading case number
  DCALLBL R0 ; casenumber 126
  PRESENT R0 else22292 ; Checking DATACALL result 
  LDR R0 #32893 ; loading case number
  DCALLBL R0 ; casenumber 125
  LDR R0 #case22016
  STR R0 $34; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22293
else22292 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22293 NOOP;
  JMP ENDS108761
ENDS108760 NOOP 
ENDS108761 NOOP 
OVERELSE22285 NOOP;
  JMP ENDS108810
case22018 NOOP; Switch Child branch
  LDR R0 #case22018
  STR R0 $35; EnterNode storing statecode : 1
  LDR R0 #case22017
  STR R0 $35; EnterNode storing statecode : 0
  LDR R0 #32896 ; loading case number
  DCALLBL R0 ; casenumber 128
  PRESENT R0 else22295 ; Checking DATACALL result 
  LDR R0 #32901 ; loading case number
  DCALLBL R0 ; casenumber 133
  LDR R0 #case22018
  STR R0 $35; EnterNode storing statecode : 1
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22296
else22295 NOOP
  LDR R0 #case22019
  STR R0 $36; EnterNode storing statecode : 0
  LDR R0 #32897 ; loading case number
  DCALLBL R0 ; casenumber 129
  PRESENT R0 else22297 ; Checking DATACALL result 
  LDR R0 #32898 ; loading case number
  DCALLBL R0 ; casenumber 130
  LDR R0 #case22020
  STR R0 $36; EnterNode storing statecode : 1
  LDR R0 #32899 ; loading case number
  DCALLBL R0 ; casenumber 131
  PRESENT R0 else22298 ; Checking DATACALL result 
  LDR R0 #32900 ; loading case number
  DCALLBL R0 ; casenumber 132
  LDR R0 #case22016
  STR R0 $34; EnterNode storing statecode : 2
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP OVERELSE22299
else22298 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22299 NOOP;
  JMP OVERELSE22300
else22297 NOOP
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
OVERELSE22300 NOOP;
OVERELSE22296 NOOP;
  JMP ENDS108811
ENDS108810 NOOP 
ENDS108811 NOOP 
  JMP ENDS109211
case22016 NOOP; Switch Child branch
  LDR R0 #case22016
  STR R0 $34; EnterNode storing statecode : 2
  LDR R0 #case22014
  STR R0 $34; EnterNode storing statecode : 0
  LDR R1 $a
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $a
  JMP ENDS109212
ENDS109210 NOOP 
ENDS109211 NOOP 
ENDS109212 NOOP 
  JMP ENDS110231
ENDS110230 NOOP 
ENDS110231 NOOP 
  LDR R0 $a; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2230201
  SUBV R1 R0 #0
  PRESENT R1 N223020
N2230201 NOOP 
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22302;
N223020 NOOP 
  LDR R0 #case21966
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP DUMMY22302;
DUMMY22302
  JMP ENDS217841
ENDS217840 NOOP 
ENDS217841 NOOP 
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2230301
  SUBV R1 R0 #0
  PRESENT R1 N223030
N2230301 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY22303;
N223030 NOOP 
  LDR R0 #case21906
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #case21906
  STR R0 $d; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY22303;
DUMMY22303
  JMP ENDS217862
ENDS217860 NOOP 
ENDS217861 NOOP 
ENDS217862 NOOP 
END0 JMP BEGIN0
  ENDPROG
