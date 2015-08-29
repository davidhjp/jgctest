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
  LDR R0 #0
  STR R0 $9; Terminate Node stored 3
  LDR R0 #case1815 ;
  STR R0 $a; Switch Node 
  LDR R0 #case1818 ;
  STR R0 $b; Switch Node 
  LDR R0 #case1820 ;
  STR R0 $c; Switch Node 
  LDR R0 #case1823 ;
  STR R0 $d; Switch Node 
  LDR R0 #case1825 ;
  STR R0 $e; Switch Node 
  LDR R0 #case1827 ;
  STR R0 $f; Switch Node 
  LDR R0 #case1829 ;
  STR R0 $10; Switch Node 
  LDR R0 #case1831 ;
  STR R0 $11; Switch Node 
  LDR R0 #case1833 ;
  STR R0 $12; Switch Node 
  LDR R0 #case1836 ;
  STR R0 $13; Switch Node 
  LDR R0 #case1840 ;
  STR R0 $14; Switch Node 
  LDR R0 #case1842 ;
  STR R0 $15; Switch Node 
  LDR R0 #case1847 ;
  STR R0 $16; Switch Node 
  LDR R0 #case1849 ;
  STR R0 $17; Switch Node 
  LDR R0 #case1851 ;
  STR R0 $18; Switch Node 
  LDR R0 #case1853 ;
  STR R0 $19; Switch Node 
  LDR R0 #case1855 ;
  STR R0 $1a; Switch Node 
  LDR R0 #case1857 ;
  STR R0 $1b; Switch Node 
  LDR R0 #case1859 ;
  STR R0 $1c; Switch Node 
  LDR R0 #case1861 ;
  STR R0 $1d; Switch Node 
  LDR R0 #case1863 ;
  STR R0 $1e; Switch Node 
  LDR R0 #case1865 ;
  STR R0 $1f; Switch Node 
  LDR R0 #case1867 ;
  STR R0 $20; Switch Node 
  LDR R0 #case1870 ;
  STR R0 $21; Switch Node 
  LDR R0 #case1872 ;
  STR R0 $22; Switch Node 
  LDR R0 #case1874 ;
  STR R0 $23; Switch Node 
  LDR R0 #case1876 ;
  STR R0 $24; Switch Node 
  LDR R0 #case1878 ;
  STR R0 $25; Switch Node 
  LDR R0 #case1880 ;
  STR R0 $26; Switch Node 
  LDR R0 #case1882 ;
  STR R0 $27; Switch Node 
  LDR R0 #case1884 ;
  STR R0 $28; Switch Node 
  LDR R0 #case1886 ;
  STR R0 $29; Switch Node 
  LDR R0 #case1888 ;
  STR R0 $2a; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT1889 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR1889  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR1889;
FER1889 SEOT; This is basically the SEOT tick
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
  STR R11 $9; storing zero to this CD's Terminate Node
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
  LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case1814 NOOP; Switch Child branch
  LDR R0 #case1814
  STR R0 $a; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS17320
case1815 NOOP; Switch Child branch
  LDR R0 #case1816
  STR R0 $a; EnterNode storing statecode : 2
  LDR R0 #case1816
  STR R0 $a; EnterNode storing statecode : 2
  LDR R0 #case1818
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case1819
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case1823
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal LightLevel_1 in mem
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    LDR R0 #case1825
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #case1826
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #case1829
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #case1831
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  LDR R0 #case1832
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #case1835
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  LDR R0 #case1840
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 #case1841
  STR R0 $15; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N189501
N189501 NOOP 
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY1895;
DUMMY1895
  LDR R0 #case1855
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R0 #case1856
  STR R0 $1b; EnterNode storing statecode : 0
  LDR R0 #case1859
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #case1860
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  PRESENT R0 else1897 ; Checking DATACALL result 
  LDR R0 #case1862
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1898
else1897 NOOP
  LDR R0 #case1863
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal armed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1898 NOOP;
  LDR R0 #case1865
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R0 #case1866
  STR R0 $20; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N189901
N189901 NOOP 
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY1899;
DUMMY1899
  LDR R0 #case1872
  STR R0 $22; EnterNode storing statecode : 1
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R0 #case1873
  STR R0 $23; EnterNode storing statecode : 0
  LDR R0 #case1875
  STR R0 $24; EnterNode storing statecode : 0
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  PRESENT R0 else1900 ; Checking DATACALL result 
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  LDR R0 #case1876
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1901
else1900 NOOP
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  PRESENT R0 else1902 ; Checking DATACALL result 
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  PRESENT R0 else1903 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal INC_4 in mem
    LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1904
else1903 NOOP
  LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1904 NOOP;
  JMP OVERELSE1905
else1902 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1905 NOOP;
OVERELSE1901 NOOP;
  LDR R0 #case1878
  STR R0 $25; EnterNode storing statecode : 1
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  LDR R0 #case1879
  STR R0 $26; EnterNode storing statecode : 0
  LDR R0 #case1881
  STR R0 $27; EnterNode storing statecode : 0
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  PRESENT R0 else1906 ; Checking DATACALL result 
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  LDR R0 #case1882
  STR R0 $27; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1907
else1906 NOOP
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  PRESENT R0 else1908 ; Checking DATACALL result 
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  PRESENT R0 else1909 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal DEC_4 in mem
    LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1910
else1909 NOOP
  LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1910 NOOP;
  JMP OVERELSE1911
else1908 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1911 NOOP;
OVERELSE1907 NOOP;
  LDR R0 #case1884
  STR R0 $28; EnterNode storing statecode : 1
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  LDR R0 #case1885
  STR R0 $29; EnterNode storing statecode : 0
  LDR R0 #case1887
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  PRESENT R0 else1912 ; Checking DATACALL result 
  LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  LDR R0 #case1888
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1913
else1912 NOOP
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  PRESENT R0 else1914 ; Checking DATACALL result 
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  PRESENT R0 else1915 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #64 ;loading the emit signal in
  STR R0 $2; emitted signal RRC_4 in mem
    LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE1916
else1915 NOOP
  LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1916 NOOP;
  JMP OVERELSE1917
else1914 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE1917 NOOP;
OVERELSE1913 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N191801
N191801 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY1918;
DUMMY1918
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N191901
  SUBV R1 R0 #1
  PRESENT R1 N191911
N191901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY1919;
N191911 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY1919;
DUMMY1919
  JMP ENDS17321
case1816 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case1817 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS240
case1818 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case1819 NOOP; Switch Child branch
  LDR R0 #case1819
  STR R0 $c; EnterNode storing statecode : 0
  LDR R0 #case1820
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  PRESENT R0 else1925 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Presence_1 in mem
    LDR R0 #case1821
  STR R0 $c; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE1926
else1925 NOOP
  LDR R0 #case1821
  STR R0 $c; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE1926 NOOP;
  JMP ENDS70
case1820 NOOP; Switch Child branch
  LDR R0 #case1819
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS71
case1821 NOOP; Switch Child branch
  LDR R0 #case1821
  STR R0 $c; EnterNode storing statecode : 2
  LDR R0 #case1819
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS72
ENDS70 NOOP 
ENDS71 NOOP 
ENDS72 NOOP 
  JMP ENDS241
ENDS240 NOOP 
ENDS241 NOOP 
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case1822 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS290
case1823 NOOP; Switch Child branch
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal LightLevel_1 in mem
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    JMP ENDS291
ENDS290 NOOP 
ENDS291 NOOP 
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case1824 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS17300
case1825 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case1826 NOOP; Switch Child branch
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case1828 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS10990
case1829 NOOP; Switch Child branch
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case1830 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS7890
case1831 NOOP; Switch Child branch
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case1832 NOOP; Switch Child branch
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case1835 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else1942 ;checking if the signal is present Presence_1
  LDR R0 #case1836
  STR R0 $13; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else1943 ;checking if the signal is present armed_4
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #512 ;Got the exact signal
  PRESENT R0 else1944 ;checking if the signal is present disarmed_4
  LDR R0 #case1837
  STR R0 $13; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1945
else1944 NOOP
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  PRESENT R0 else1946 ; Checking DATACALL result 
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal tempsigyo_4 in mem
    LDR R0 #case1833
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16 ;Got the exact signal
  PRESENT R0 else1947 ;checking if the signal is present tempsigyo2_4
  LDR R0 #case1834
  STR R0 $12; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1948
else1947 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1948 NOOP;
  JMP OVERELSE1949
else1946 NOOP
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1949 NOOP;
OVERELSE1945 NOOP;
  JMP OVERELSE1950
else1943 NOOP
  LDR R0 #case1837
  STR R0 $13; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1950 NOOP;
  JMP OVERELSE1951
else1942 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1951 NOOP;
  JMP ENDS740
case1836 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #512 ;Got the exact signal
  PRESENT R0 else1953 ;checking if the signal is present disarmed_4
  LDR R0 #case1837
  STR R0 $13; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1954
else1953 NOOP
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  PRESENT R0 else1955 ; Checking DATACALL result 
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  LDR R0 #32804 ; loading case number
  DCALLBL R0 ; casenumber 36
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32 ;loading the emit signal in
  STR R0 $2; emitted signal tempsigyo_4 in mem
    LDR R0 #case1833
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16 ;Got the exact signal
  PRESENT R0 else1956 ;checking if the signal is present tempsigyo2_4
  LDR R0 #case1834
  STR R0 $12; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1957
else1956 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1957 NOOP;
  JMP OVERELSE1958
else1955 NOOP
  LDR R0 #32805 ; loading case number
  DCALLBL R0 ; casenumber 37
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1958 NOOP;
OVERELSE1954 NOOP;
  JMP ENDS741
case1837 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else1960 ;checking if the signal is present LightLevel_1
  LDR R0 #32806 ; loading case number
  DCALLBL R0 ; casenumber 38
  LDR R0 #case1838
  STR R0 $13; EnterNode storing statecode : 3
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1961
else1960 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1961 NOOP;
  JMP ENDS742
case1838 NOOP; Switch Child branch
  LDR R0 #case1838
  STR R0 $13; EnterNode storing statecode : 3
  LDR R0 #case1835
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS743
ENDS740 NOOP 
ENDS741 NOOP 
ENDS742 NOOP 
ENDS743 NOOP 
  JMP ENDS1600
case1833 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16 ;Got the exact signal
  PRESENT R0 else1964 ;checking if the signal is present tempsigyo2_4
  LDR R0 #case1834
  STR R0 $12; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1965
else1964 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1965 NOOP;
  JMP ENDS1601
case1834 NOOP; Switch Child branch
  LDR R0 #case1834
  STR R0 $12; EnterNode storing statecode : 2
  LDR R0 #case1832
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #case1835
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS1602
ENDS1600 NOOP 
ENDS1601 NOOP 
ENDS1602 NOOP 
  JMP ENDS7891
ENDS7890 NOOP 
ENDS7891 NOOP 
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case1839 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS10970
case1840 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case1841 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32 ;Got the exact signal
  PRESENT R0 else1970 ;checking if the signal is present tempsigyo_4
  LDR R0 #case1842
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #case1846
  STR R0 $16; EnterNode storing statecode : 0
  LDR R0 #32807 ; loading case number
  DCALLBL R0 ; casenumber 39
  PRESENT R0 else1971 ; Checking DATACALL result 
  LDR R0 #32812 ; loading case number
  DCALLBL R0 ; casenumber 44
  LDR R0 #case1847
  STR R0 $16; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1972
else1971 NOOP
  LDR R0 #case1848
  STR R0 $17; EnterNode storing statecode : 0
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  PRESENT R0 else1973 ; Checking DATACALL result 
  LDR R0 #32809 ; loading case number
  DCALLBL R0 ; casenumber 41
  LDR R0 #case1849
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 #32810 ; loading case number
  DCALLBL R0 ; casenumber 42
  PRESENT R0 else1974 ; Checking DATACALL result 
  LDR R0 #32811 ; loading case number
  DCALLBL R0 ; casenumber 43
  LDR R0 #case1843
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1975
else1974 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1975 NOOP;
  JMP OVERELSE1976
else1973 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1976 NOOP;
OVERELSE1972 NOOP;
  JMP OVERELSE1977
else1970 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1977 NOOP;
  JMP ENDS8390
case1842 NOOP; Switch Child branch
    LDR R0 $16
  JMP R0 ; SwitchNode unconditional jump
case1846 NOOP; Switch Child branch
  LDR R0 #32813 ; loading case number
  DCALLBL R0 ; casenumber 45
  PRESENT R0 else1980 ; Checking DATACALL result 
  LDR R0 #32819 ; loading case number
  DCALLBL R0 ; casenumber 51
  LDR R0 #case1847
  STR R0 $16; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1981
else1980 NOOP
    LDR R0 $17
  JMP R0 ; SwitchNode unconditional jump
case1848 NOOP; Switch Child branch
  LDR R0 #32814 ; loading case number
  DCALLBL R0 ; casenumber 46
  PRESENT R0 else1983 ; Checking DATACALL result 
  LDR R0 #32815 ; loading case number
  DCALLBL R0 ; casenumber 47
  LDR R0 #case1849
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  PRESENT R0 else1984 ; Checking DATACALL result 
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  LDR R0 #case1843
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1985
else1984 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1985 NOOP;
  JMP OVERELSE1986
else1983 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1986 NOOP;
  JMP ENDS7940
case1849 NOOP; Switch Child branch
  LDR R0 #32818 ; loading case number
  DCALLBL R0 ; casenumber 50
  PRESENT R0 else1988 ; Checking DATACALL result 
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  LDR R0 #case1843
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1989
else1988 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1989 NOOP;
  JMP ENDS7941
ENDS7940 NOOP 
ENDS7941 NOOP 
OVERELSE1981 NOOP;
  JMP ENDS7990
case1847 NOOP; Switch Child branch
  LDR R0 #case1847
  STR R0 $16; EnterNode storing statecode : 1
  LDR R0 #case1846
  STR R0 $16; EnterNode storing statecode : 0
  LDR R0 #32820 ; loading case number
  DCALLBL R0 ; casenumber 52
  PRESENT R0 else1991 ; Checking DATACALL result 
  LDR R0 #32825 ; loading case number
  DCALLBL R0 ; casenumber 57
  LDR R0 #case1847
  STR R0 $16; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1992
else1991 NOOP
  LDR R0 #case1848
  STR R0 $17; EnterNode storing statecode : 0
  LDR R0 #32821 ; loading case number
  DCALLBL R0 ; casenumber 53
  PRESENT R0 else1993 ; Checking DATACALL result 
  LDR R0 #32822 ; loading case number
  DCALLBL R0 ; casenumber 54
  LDR R0 #case1849
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 #32823 ; loading case number
  DCALLBL R0 ; casenumber 55
  PRESENT R0 else1994 ; Checking DATACALL result 
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R0 #case1843
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1995
else1994 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1995 NOOP;
  JMP OVERELSE1996
else1993 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE1996 NOOP;
OVERELSE1992 NOOP;
  JMP ENDS7991
ENDS7990 NOOP 
ENDS7991 NOOP 
  JMP ENDS8391
case1843 NOOP; Switch Child branch
  LDR R0 #case1843
  STR R0 $15; EnterNode storing statecode : 2
  LDR R0 #case1844
  STR R0 $15; EnterNode storing statecode : 3
  LDR R0 #case1850
  STR R0 $18; EnterNode storing statecode : 0
  LDR R0 #32826 ; loading case number
  DCALLBL R0 ; casenumber 58
  PRESENT R0 else1998 ; Checking DATACALL result 
  LDR R0 #32831 ; loading case number
  DCALLBL R0 ; casenumber 63
  LDR R0 #case1851
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE1999
else1998 NOOP
  LDR R0 #case1852
  STR R0 $19; EnterNode storing statecode : 0
  LDR R0 #32827 ; loading case number
  DCALLBL R0 ; casenumber 59
  PRESENT R0 else2000 ; Checking DATACALL result 
  LDR R0 #32828 ; loading case number
  DCALLBL R0 ; casenumber 60
  LDR R0 #case1853
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  PRESENT R0 else2001 ; Checking DATACALL result 
  LDR R0 #32830 ; loading case number
  DCALLBL R0 ; casenumber 62
  LDR R0 #case1845
  STR R0 $15; EnterNode storing statecode : 4
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2002
else2001 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2002 NOOP;
  JMP OVERELSE2003
else2000 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2003 NOOP;
OVERELSE1999 NOOP;
  JMP ENDS8392
case1844 NOOP; Switch Child branch
    LDR R0 $18
  JMP R0 ; SwitchNode unconditional jump
case1850 NOOP; Switch Child branch
  LDR R0 #32832 ; loading case number
  DCALLBL R0 ; casenumber 64
  PRESENT R0 else2006 ; Checking DATACALL result 
  LDR R0 #32838 ; loading case number
  DCALLBL R0 ; casenumber 70
  LDR R0 #case1851
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2007
else2006 NOOP
    LDR R0 $19
  JMP R0 ; SwitchNode unconditional jump
case1852 NOOP; Switch Child branch
  LDR R0 #32833 ; loading case number
  DCALLBL R0 ; casenumber 65
  PRESENT R0 else2009 ; Checking DATACALL result 
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 #case1853
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 #32835 ; loading case number
  DCALLBL R0 ; casenumber 67
  PRESENT R0 else2010 ; Checking DATACALL result 
  LDR R0 #32836 ; loading case number
  DCALLBL R0 ; casenumber 68
  LDR R0 #case1845
  STR R0 $15; EnterNode storing statecode : 4
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2011
else2010 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2011 NOOP;
  JMP OVERELSE2012
else2009 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2012 NOOP;
  JMP ENDS8430
case1853 NOOP; Switch Child branch
  LDR R0 #32837 ; loading case number
  DCALLBL R0 ; casenumber 69
  PRESENT R0 else2014 ; Checking DATACALL result 
  LDR R0 #32836 ; loading case number
  DCALLBL R0 ; casenumber 68
  LDR R0 #case1845
  STR R0 $15; EnterNode storing statecode : 4
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2015
else2014 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2015 NOOP;
  JMP ENDS8431
ENDS8430 NOOP 
ENDS8431 NOOP 
OVERELSE2007 NOOP;
  JMP ENDS8480
case1851 NOOP; Switch Child branch
  LDR R0 #case1851
  STR R0 $18; EnterNode storing statecode : 1
  LDR R0 #case1850
  STR R0 $18; EnterNode storing statecode : 0
  LDR R0 #32839 ; loading case number
  DCALLBL R0 ; casenumber 71
  PRESENT R0 else2017 ; Checking DATACALL result 
  LDR R0 #32844 ; loading case number
  DCALLBL R0 ; casenumber 76
  LDR R0 #case1851
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2018
else2017 NOOP
  LDR R0 #case1852
  STR R0 $19; EnterNode storing statecode : 0
  LDR R0 #32840 ; loading case number
  DCALLBL R0 ; casenumber 72
  PRESENT R0 else2019 ; Checking DATACALL result 
  LDR R0 #32841 ; loading case number
  DCALLBL R0 ; casenumber 73
  LDR R0 #case1853
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  PRESENT R0 else2020 ; Checking DATACALL result 
  LDR R0 #32843 ; loading case number
  DCALLBL R0 ; casenumber 75
  LDR R0 #case1845
  STR R0 $15; EnterNode storing statecode : 4
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2021
else2020 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2021 NOOP;
  JMP OVERELSE2022
else2019 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2022 NOOP;
OVERELSE2018 NOOP;
  JMP ENDS8481
ENDS8480 NOOP 
ENDS8481 NOOP 
  JMP ENDS8393
case1845 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #64 ;Got the exact signal
  PRESENT R0 else2024 ;checking if the signal is present RRC_4
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16 ;loading the emit signal in
  STR R0 $2; emitted signal tempsigyo2_4 in mem
    LDR R0 #case1841
  STR R0 $15; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2025
else2024 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2025 NOOP;
  JMP ENDS8394
ENDS8390 NOOP 
ENDS8391 NOOP 
ENDS8392 NOOP 
ENDS8393 NOOP 
ENDS8394 NOOP 
  JMP ENDS10971
ENDS10970 NOOP 
ENDS10971 NOOP 
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N202601
  SUBV R1 R0 #0
  PRESENT R1 N20260
N202601 NOOP 
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY2026;
N20260 NOOP 
  LDR R0 #case1828
  STR R0 $10; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY2026;
DUMMY2026
  JMP ENDS10991
ENDS10990 NOOP 
ENDS10991 NOOP 
    LDR R0 $1a
  JMP R0 ; SwitchNode unconditional jump
case1854 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS14070
case1855 NOOP; Switch Child branch
    LDR R0 $1b
  JMP R0 ; SwitchNode unconditional jump
case1856 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #64 ;Got the exact signal
  PRESENT R0 else2030 ;checking if the signal is present RRC_4
  LDR R0 #case1857
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2031
else2030 NOOP
    LDR R0 $1c
  JMP R0 ; SwitchNode unconditional jump
case1858 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS11670
case1859 NOOP; Switch Child branch
    LDR R0 $1d
  JMP R0 ; SwitchNode unconditional jump
case1860 NOOP; Switch Child branch
    LDR R0 $1e
  JMP R0 ; SwitchNode unconditional jump
case1862 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #128; Anding to get the right signal bit DEC_4
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #256; Anding to get the right signal bit INC_4
  PRESENT R0 FALSE2038; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE2038 PRESENT R1 FALSE2039; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE2039
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else2037 ;checking if the signal is present INC_4.getprestatus() || DEC_4.getprestatus()
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #256 ;Got the exact signal
  PRESENT R0 else2040 ;checking if the signal is present INC_4
  LDR R0 #32845 ; loading case number
  DCALLBL R0 ; casenumber 77
  LDR R0 #case1861
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2041
else2040 NOOP
  LDR R0 #32846 ; loading case number
  DCALLBL R0 ; casenumber 78
  LDR R0 #case1861
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2041 NOOP;
  JMP OVERELSE2042
else2037 NOOP
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2042 NOOP;
  JMP ENDS11090
case1863 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #256 ;Got the exact signal
  PRESENT R0 else2044 ;checking if the signal is present INC_4
  LDR R0 #32847 ; loading case number
  DCALLBL R0 ; casenumber 79
  LDR R0 #case1861
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2045
else2044 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal armed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2045 NOOP;
  JMP ENDS11091
ENDS11090 NOOP 
ENDS11091 NOOP 
  JMP ENDS11100
case1861 NOOP; Switch Child branch
  LDR R0 #case1861
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R0 #case1860
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R0 #32848 ; loading case number
  DCALLBL R0 ; casenumber 80
  PRESENT R0 else2047 ; Checking DATACALL result 
  LDR R0 #case1862
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2048
else2047 NOOP
  LDR R0 #case1863
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal armed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2048 NOOP;
  JMP ENDS11101
ENDS11100 NOOP 
ENDS11101 NOOP 
  JMP ENDS11671
ENDS11670 NOOP 
ENDS11671 NOOP 
    LDR R0 $1f
  JMP R0 ; SwitchNode unconditional jump
case1864 NOOP; Switch Child branch
  LDR R1 $9
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS11990
case1865 NOOP; Switch Child branch
    LDR R0 $20
  JMP R0 ; SwitchNode unconditional jump
case1866 NOOP; Switch Child branch
  LDR R0 #case1866
  STR R0 $20; EnterNode storing statecode : 0
  LDR R0 #case1867
  STR R0 $20; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP ENDS11680
case1867 NOOP; Switch Child branch
  LDR R0 #case1867
  STR R0 $20; EnterNode storing statecode : 1
  LDR R0 #case1868
  STR R0 $20; EnterNode storing statecode : 2
  LDR R0 #case1869
  STR R0 $21; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else2053 ;checking if the signal is present armed_4
  LDR R0 #case1870
  STR R0 $21; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2054
else2053 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal disarmed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2054 NOOP;
  JMP ENDS11681
case1868 NOOP; Switch Child branch
    LDR R0 $21
  JMP R0 ; SwitchNode unconditional jump
case1869 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else2057 ;checking if the signal is present armed_4
  LDR R0 #case1870
  STR R0 $21; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2058
else2057 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal disarmed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2058 NOOP;
  JMP ENDS11730
case1870 NOOP; Switch Child branch
  LDR R0 #case1870
  STR R0 $21; EnterNode storing statecode : 1
  LDR R0 #case1869
  STR R0 $21; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else2060 ;checking if the signal is present armed_4
  LDR R0 #case1870
  STR R0 $21; EnterNode storing statecode : 1
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2061
else2060 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal disarmed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2061 NOOP;
  JMP ENDS11731
ENDS11730 NOOP 
ENDS11731 NOOP 
  JMP ENDS11682
ENDS11680 NOOP 
ENDS11681 NOOP 
ENDS11682 NOOP 
  JMP ENDS11991
ENDS11990 NOOP 
ENDS11991 NOOP 
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N206201
  SUBV R1 R0 #0
  PRESENT R1 N20620
N206201 NOOP 
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY2062;
N20620 NOOP 
  LDR R0 #case1857
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY2062;
DUMMY2062
OVERELSE2031 NOOP;
  JMP ENDS12010
case1857 NOOP; Switch Child branch
  LDR R0 #case1857
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 #case1856
  STR R0 $1b; EnterNode storing statecode : 0
  LDR R0 #case1859
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R0 #32849 ; loading case number
  DCALLBL R0 ; casenumber 81
  LDR R0 #case1860
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  PRESENT R0 else2065 ; Checking DATACALL result 
  LDR R0 #case1862
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  JMP OVERELSE2066
else2065 NOOP
  LDR R0 #case1863
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal armed_4 in mem
    LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
OVERELSE2066 NOOP;
  LDR R0 #case1865
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R0 #case1866
  STR R0 $20; EnterNode storing statecode : 0
  LDR R1 $9
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $9
  LDR R0 $9; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N206701
N206701 NOOP 
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP DUMMY2067;
DUMMY2067
  JMP ENDS12011
ENDS12010 NOOP 
ENDS12011 NOOP 
  JMP ENDS14071
ENDS14070 NOOP 
ENDS14071 NOOP 
    LDR R0 $22
  JMP R0 ; SwitchNode unconditional jump
case1871 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS15140
case1872 NOOP; Switch Child branch
    LDR R0 $23
  JMP R0 ; SwitchNode unconditional jump
case1873 NOOP; Switch Child branch
    LDR R0 $24
  JMP R0 ; SwitchNode unconditional jump
case1875 NOOP; Switch Child branch
  LDR R0 #32851 ; loading case number
  DCALLBL R0 ; casenumber 83
  PRESENT R0 else2072 ; Checking DATACALL result 
  LDR R0 #32856 ; loading case number
  DCALLBL R0 ; casenumber 88
  LDR R0 #case1876
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2073
else2072 NOOP
  LDR R0 #32852 ; loading case number
  DCALLBL R0 ; casenumber 84
  PRESENT R0 else2074 ; Checking DATACALL result 
  LDR R0 #32853 ; loading case number
  DCALLBL R0 ; casenumber 85
  LDR R0 #32854 ; loading case number
  DCALLBL R0 ; casenumber 86
  LDR R0 #32855 ; loading case number
  DCALLBL R0 ; casenumber 87
  PRESENT R0 else2075 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal INC_4 in mem
    LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2076
else2075 NOOP
  LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2076 NOOP;
  JMP OVERELSE2077
else2074 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2077 NOOP;
OVERELSE2073 NOOP;
  JMP ENDS14130
case1876 NOOP; Switch Child branch
  LDR R0 #case1876
  STR R0 $24; EnterNode storing statecode : 1
  LDR R0 #case1875
  STR R0 $24; EnterNode storing statecode : 0
  LDR R0 #32857 ; loading case number
  DCALLBL R0 ; casenumber 89
  PRESENT R0 else2079 ; Checking DATACALL result 
  LDR R0 #32862 ; loading case number
  DCALLBL R0 ; casenumber 94
  LDR R0 #case1876
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2080
else2079 NOOP
  LDR R0 #32858 ; loading case number
  DCALLBL R0 ; casenumber 90
  PRESENT R0 else2081 ; Checking DATACALL result 
  LDR R0 #32859 ; loading case number
  DCALLBL R0 ; casenumber 91
  LDR R0 #32860 ; loading case number
  DCALLBL R0 ; casenumber 92
  LDR R0 #32861 ; loading case number
  DCALLBL R0 ; casenumber 93
  PRESENT R0 else2082 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal INC_4 in mem
    LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2083
else2082 NOOP
  LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2083 NOOP;
  JMP OVERELSE2084
else2081 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2084 NOOP;
OVERELSE2080 NOOP;
  JMP ENDS14131
ENDS14130 NOOP 
ENDS14131 NOOP 
  JMP ENDS14380
case1874 NOOP; Switch Child branch
  LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 #case1873
  STR R0 $23; EnterNode storing statecode : 0
  LDR R0 #case1875
  STR R0 $24; EnterNode storing statecode : 0
  LDR R0 #32864 ; loading case number
  DCALLBL R0 ; casenumber 96
  PRESENT R0 else2086 ; Checking DATACALL result 
  LDR R0 #32869 ; loading case number
  DCALLBL R0 ; casenumber 101
  LDR R0 #case1876
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2087
else2086 NOOP
  LDR R0 #32865 ; loading case number
  DCALLBL R0 ; casenumber 97
  PRESENT R0 else2088 ; Checking DATACALL result 
  LDR R0 #32866 ; loading case number
  DCALLBL R0 ; casenumber 98
  LDR R0 #32867 ; loading case number
  DCALLBL R0 ; casenumber 99
  LDR R0 #32868 ; loading case number
  DCALLBL R0 ; casenumber 100
  PRESENT R0 else2089 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal INC_4 in mem
    LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2090
else2089 NOOP
  LDR R0 #case1874
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2090 NOOP;
  JMP OVERELSE2091
else2088 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2091 NOOP;
OVERELSE2087 NOOP;
  JMP ENDS14381
ENDS14380 NOOP 
ENDS14381 NOOP 
  JMP ENDS15141
ENDS15140 NOOP 
ENDS15141 NOOP 
    LDR R0 $25
  JMP R0 ; SwitchNode unconditional jump
case1877 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS16210
case1878 NOOP; Switch Child branch
    LDR R0 $26
  JMP R0 ; SwitchNode unconditional jump
case1879 NOOP; Switch Child branch
    LDR R0 $27
  JMP R0 ; SwitchNode unconditional jump
case1881 NOOP; Switch Child branch
  LDR R0 #32870 ; loading case number
  DCALLBL R0 ; casenumber 102
  PRESENT R0 else2096 ; Checking DATACALL result 
  LDR R0 #32875 ; loading case number
  DCALLBL R0 ; casenumber 107
  LDR R0 #case1882
  STR R0 $27; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2097
else2096 NOOP
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  PRESENT R0 else2098 ; Checking DATACALL result 
  LDR R0 #32872 ; loading case number
  DCALLBL R0 ; casenumber 104
  LDR R0 #32873 ; loading case number
  DCALLBL R0 ; casenumber 105
  LDR R0 #32874 ; loading case number
  DCALLBL R0 ; casenumber 106
  PRESENT R0 else2099 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal DEC_4 in mem
    LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2100
else2099 NOOP
  LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2100 NOOP;
  JMP OVERELSE2101
else2098 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2101 NOOP;
OVERELSE2097 NOOP;
  JMP ENDS15200
case1882 NOOP; Switch Child branch
  LDR R0 #case1882
  STR R0 $27; EnterNode storing statecode : 1
  LDR R0 #case1881
  STR R0 $27; EnterNode storing statecode : 0
  LDR R0 #32876 ; loading case number
  DCALLBL R0 ; casenumber 108
  PRESENT R0 else2103 ; Checking DATACALL result 
  LDR R0 #32881 ; loading case number
  DCALLBL R0 ; casenumber 113
  LDR R0 #case1882
  STR R0 $27; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2104
else2103 NOOP
  LDR R0 #32877 ; loading case number
  DCALLBL R0 ; casenumber 109
  PRESENT R0 else2105 ; Checking DATACALL result 
  LDR R0 #32878 ; loading case number
  DCALLBL R0 ; casenumber 110
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R0 #32880 ; loading case number
  DCALLBL R0 ; casenumber 112
  PRESENT R0 else2106 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal DEC_4 in mem
    LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2107
else2106 NOOP
  LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2107 NOOP;
  JMP OVERELSE2108
else2105 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2108 NOOP;
OVERELSE2104 NOOP;
  JMP ENDS15201
ENDS15200 NOOP 
ENDS15201 NOOP 
  JMP ENDS15450
case1880 NOOP; Switch Child branch
  LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R0 #32882 ; loading case number
  DCALLBL R0 ; casenumber 114
  LDR R0 #case1879
  STR R0 $26; EnterNode storing statecode : 0
  LDR R0 #case1881
  STR R0 $27; EnterNode storing statecode : 0
  LDR R0 #32883 ; loading case number
  DCALLBL R0 ; casenumber 115
  PRESENT R0 else2110 ; Checking DATACALL result 
  LDR R0 #32888 ; loading case number
  DCALLBL R0 ; casenumber 120
  LDR R0 #case1882
  STR R0 $27; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2111
else2110 NOOP
  LDR R0 #32884 ; loading case number
  DCALLBL R0 ; casenumber 116
  PRESENT R0 else2112 ; Checking DATACALL result 
  LDR R0 #32885 ; loading case number
  DCALLBL R0 ; casenumber 117
  LDR R0 #32886 ; loading case number
  DCALLBL R0 ; casenumber 118
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  PRESENT R0 else2113 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal DEC_4 in mem
    LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2114
else2113 NOOP
  LDR R0 #case1880
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2114 NOOP;
  JMP OVERELSE2115
else2112 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2115 NOOP;
OVERELSE2111 NOOP;
  JMP ENDS15451
ENDS15450 NOOP 
ENDS15451 NOOP 
  JMP ENDS16211
ENDS16210 NOOP 
ENDS16211 NOOP 
    LDR R0 $28
  JMP R0 ; SwitchNode unconditional jump
case1883 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS17280
case1884 NOOP; Switch Child branch
    LDR R0 $29
  JMP R0 ; SwitchNode unconditional jump
case1885 NOOP; Switch Child branch
    LDR R0 $2a
  JMP R0 ; SwitchNode unconditional jump
case1887 NOOP; Switch Child branch
  LDR R0 #32889 ; loading case number
  DCALLBL R0 ; casenumber 121
  PRESENT R0 else2120 ; Checking DATACALL result 
  LDR R0 #32894 ; loading case number
  DCALLBL R0 ; casenumber 126
  LDR R0 #case1888
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2121
else2120 NOOP
  LDR R0 #32890 ; loading case number
  DCALLBL R0 ; casenumber 122
  PRESENT R0 else2122 ; Checking DATACALL result 
  LDR R0 #32891 ; loading case number
  DCALLBL R0 ; casenumber 123
  LDR R0 #32892 ; loading case number
  DCALLBL R0 ; casenumber 124
  LDR R0 #32893 ; loading case number
  DCALLBL R0 ; casenumber 125
  PRESENT R0 else2123 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #64 ;loading the emit signal in
  STR R0 $2; emitted signal RRC_4 in mem
    LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2124
else2123 NOOP
  LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2124 NOOP;
  JMP OVERELSE2125
else2122 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2125 NOOP;
OVERELSE2121 NOOP;
  JMP ENDS16270
case1888 NOOP; Switch Child branch
  LDR R0 #case1888
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R0 #case1887
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  PRESENT R0 else2127 ; Checking DATACALL result 
  LDR R0 #32900 ; loading case number
  DCALLBL R0 ; casenumber 132
  LDR R0 #case1888
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2128
else2127 NOOP
  LDR R0 #32896 ; loading case number
  DCALLBL R0 ; casenumber 128
  PRESENT R0 else2129 ; Checking DATACALL result 
  LDR R0 #32897 ; loading case number
  DCALLBL R0 ; casenumber 129
  LDR R0 #32898 ; loading case number
  DCALLBL R0 ; casenumber 130
  LDR R0 #32899 ; loading case number
  DCALLBL R0 ; casenumber 131
  PRESENT R0 else2130 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #64 ;loading the emit signal in
  STR R0 $2; emitted signal RRC_4 in mem
    LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2131
else2130 NOOP
  LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2131 NOOP;
  JMP OVERELSE2132
else2129 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2132 NOOP;
OVERELSE2128 NOOP;
  JMP ENDS16271
ENDS16270 NOOP 
ENDS16271 NOOP 
  JMP ENDS16520
case1886 NOOP; Switch Child branch
  LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R0 #32901 ; loading case number
  DCALLBL R0 ; casenumber 133
  LDR R0 #case1885
  STR R0 $29; EnterNode storing statecode : 0
  LDR R0 #case1887
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #32902 ; loading case number
  DCALLBL R0 ; casenumber 134
  PRESENT R0 else2134 ; Checking DATACALL result 
  LDR R0 #32907 ; loading case number
  DCALLBL R0 ; casenumber 139
  LDR R0 #case1888
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2135
else2134 NOOP
  LDR R0 #32903 ; loading case number
  DCALLBL R0 ; casenumber 135
  PRESENT R0 else2136 ; Checking DATACALL result 
  LDR R0 #32904 ; loading case number
  DCALLBL R0 ; casenumber 136
  LDR R0 #32905 ; loading case number
  DCALLBL R0 ; casenumber 137
  LDR R0 #32906 ; loading case number
  DCALLBL R0 ; casenumber 138
  PRESENT R0 else2137 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #64 ;loading the emit signal in
  STR R0 $2; emitted signal RRC_4 in mem
    LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2138
else2137 NOOP
  LDR R0 #case1886
  STR R0 $29; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2138 NOOP;
  JMP OVERELSE2139
else2136 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2139 NOOP;
OVERELSE2135 NOOP;
  JMP ENDS16521
ENDS16520 NOOP 
ENDS16521 NOOP 
  JMP ENDS17281
ENDS17280 NOOP 
ENDS17281 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N214001
  SUBV R1 R0 #0
  PRESENT R1 N21400
N214001 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2140;
N21400 NOOP 
  LDR R0 #case1827
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2140;
DUMMY2140
  JMP ENDS17290
case1827 NOOP; Switch Child branch
  LDR R0 #case1827
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #case1824
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS17291
ENDS17290 NOOP 
ENDS17291 NOOP 
  JMP ENDS17301
ENDS17300 NOOP 
ENDS17301 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N214201
  SUBV R1 R0 #0
  PRESENT R1 N21420
N214201 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY2142;
N21420 NOOP 
  LDR R0 #case1814
  STR R0 $a; EnterNode storing statecode : 0
  LDR R0 #case1814
  STR R0 $a; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY2142;
DUMMY2142
  JMP ENDS17322
ENDS17320 NOOP 
ENDS17321 NOOP 
ENDS17322 NOOP 
END0 JMP BEGIN0
  ENDPROG
