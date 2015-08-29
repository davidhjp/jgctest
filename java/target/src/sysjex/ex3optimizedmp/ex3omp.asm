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
  LDR R0 #case210 ;
  STR R0 $8; Switch Node 
  LDR R0 #case213 ;
  STR R0 $9; Switch Node 
  LDR R0 #case215 ;
  STR R0 $a; Switch Node 
  LDR R0 #case217 ;
  STR R0 $b; Switch Node 
  LDR R0 #case219 ;
  STR R0 $c; Switch Node 
  LDR R0 #case221 ;
  STR R0 $d; Switch Node 
  LDR R0 #case223 ;
  STR R0 $e; Switch Node 
  LDR R0 #case226 ;
  STR R0 $f; Switch Node 
  LDR R0 #case228 ;
  STR R0 $10; Switch Node 
  LDR R0 #case230 ;
  STR R0 $11; Switch Node 
  LDR R0 #case232 ;
  STR R0 $12; Switch Node 
  LDR R0 #case234 ;
  STR R0 $13; Switch Node 
  LDR R0 #case236 ;
  STR R0 $14; Switch Node 
  LDR R0 #case238 ;
  STR R0 $15; Switch Node 
  LDR R0 #case241 ;
  STR R0 $16; Switch Node 
  LDR R0 #case243 ;
  STR R0 $17; Switch Node 
  LDR R0 #case245 ;
  STR R0 $18; Switch Node 
  LDR R0 #case247 ;
  STR R0 $19; Switch Node 
  LDR R0 #case249 ;
  STR R0 $1a; Switch Node 
  LDR R0 #case251 ;
  STR R0 $1b; Switch Node 
  LDR R0 #case253 ;
  STR R0 $1c; Switch Node 
  LDR R0 #case256 ;
  STR R0 $1d; Switch Node 
  LDR R0 #case258 ;
  STR R0 $1e; Switch Node 
  LDR R0 #case260 ;
  STR R0 $1f; Switch Node 
  LDR R0 #case262 ;
  STR R0 $20; Switch Node 
  LDR R0 #case264 ;
  STR R0 $21; Switch Node 
  LDR R0 #case266 ;
  STR R0 $22; Switch Node 
  LDR R0 #case268 ;
  STR R0 $23; Switch Node 
  LDR R0 #case271 ;
  STR R0 $24; Switch Node 
  LDR R0 #case273 ;
  STR R0 $25; Switch Node 
  LDR R0 #case275 ;
  STR R0 $26; Switch Node 
  LDR R0 #case277 ;
  STR R0 $27; Switch Node 
  LDR R0 #case279 ;
  STR R0 $28; Switch Node 
  LDR R0 #case281 ;
  STR R0 $29; Switch Node 
  LDR R0 #case283 ;
  STR R0 $2a; Switch Node 
  LDR R0 #case286 ;
  STR R0 $2b; Switch Node 
  LDR R0 #case288 ;
  STR R0 $2c; Switch Node 
  LDR R0 #case290 ;
  STR R0 $2d; Switch Node 
  LDR R0 #case292 ;
  STR R0 $2e; Switch Node 
  LDR R0 #case294 ;
  STR R0 $2f; Switch Node 
  LDR R0 #case296 ;
  STR R0 $30; Switch Node 
  LDR R0 #case298 ;
  STR R0 $31; Switch Node 
  LDR R0 #case301 ;
  STR R0 $32; Switch Node 
  LDR R0 #case303 ;
  STR R0 $33; Switch Node 
  LDR R0 #case305 ;
  STR R0 $34; Switch Node 
  LDR R0 #case307 ;
  STR R0 $35; Switch Node 
  LDR R0 #case309 ;
  STR R0 $36; Switch Node 
  LDR R0 #case311 ;
  STR R0 $37; Switch Node 
  LDR R0 #case313 ;
  STR R0 $38; Switch Node 
  LDR R0 #case316 ;
  STR R0 $39; Switch Node 
  LDR R0 #case318 ;
  STR R0 $3a; Switch Node 
  LDR R0 #case320 ;
  STR R0 $3b; Switch Node 
  LDR R0 #case322 ;
  STR R0 $3c; Switch Node 
  LDR R0 #case324 ;
  STR R0 $3d; Switch Node 
  LDR R0 #case326 ;
  STR R0 $3e; Switch Node 
  LDR R0 #case328 ;
  STR R0 $3f; Switch Node 
  LDR R0 #case331 ;
  STR R0 $40; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT332 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR332  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR332;
FER332 SEOT; This is basically the SEOT tick
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
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
  LDR R0 $8
  JMP R0 ; SwitchNode unconditional jump
case209 NOOP; Switch Child branch
  LDR R0 #case209
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS1550
case210 NOOP; Switch Child branch
  LDR R0 #case211
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case211
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case213
  STR R0 $9; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case214
  STR R0 $a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case217
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case218
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case221
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 #case222
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case228
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case229
  STR R0 $11; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case232
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case233
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case236
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 #case237
  STR R0 $15; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case243
  STR R0 $17; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case244
  STR R0 $18; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case247
  STR R0 $19; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case248
  STR R0 $1a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case251
  STR R0 $1b; EnterNode storing statecode : 1
  LDR R0 #case252
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case258
  STR R0 $1e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case259
  STR R0 $1f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case262
  STR R0 $20; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case263
  STR R0 $21; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case266
  STR R0 $22; EnterNode storing statecode : 1
  LDR R0 #case267
  STR R0 $23; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case273
  STR R0 $25; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case274
  STR R0 $26; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case277
  STR R0 $27; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case278
  STR R0 $28; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case281
  STR R0 $29; EnterNode storing statecode : 1
  LDR R0 #case282
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case288
  STR R0 $2c; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case289
  STR R0 $2d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case292
  STR R0 $2e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case293
  STR R0 $2f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case296
  STR R0 $30; EnterNode storing statecode : 1
  LDR R0 #case297
  STR R0 $31; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case303
  STR R0 $33; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case304
  STR R0 $34; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case307
  STR R0 $35; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case308
  STR R0 $36; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case311
  STR R0 $37; EnterNode storing statecode : 1
  LDR R0 #case312
  STR R0 $38; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case318
  STR R0 $3a; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal A_1 in mem
    LDR R0 #case319
  STR R0 $3b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case322
  STR R0 $3c; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal D_1 in mem
    LDR R0 #case323
  STR R0 $3d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case326
  STR R0 $3e; EnterNode storing statecode : 1
  LDR R0 #case327
  STR R0 $3f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N33601
N33601 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY336;
DUMMY336
  JMP ENDS1551
case211 NOOP; Switch Child branch
    LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case212 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS150
case213 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case214 NOOP; Switch Child branch
  LDR R0 #case214
  STR R0 $a; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else342 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case215
  STR R0 $a; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE343
else342 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case215
  STR R0 $a; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE343 NOOP;
  JMP ENDS100
case215 NOOP; Switch Child branch
  LDR R0 #case215
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 #case212
  STR R0 $9; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS101
ENDS100 NOOP 
ENDS101 NOOP 
  JMP ENDS151
ENDS150 NOOP 
ENDS151 NOOP 
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case216 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS210
case217 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case218 NOOP; Switch Child branch
  LDR R0 #case218
  STR R0 $c; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE349; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE349 PRESENT R1 FALSE350; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE350
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else348 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case219
  STR R0 $c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE351
else348 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case219
  STR R0 $c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE351 NOOP;
  JMP ENDS160
case219 NOOP; Switch Child branch
  LDR R0 #case219
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #case216
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS161
ENDS160 NOOP 
ENDS161 NOOP 
  JMP ENDS211
ENDS210 NOOP 
ENDS211 NOOP 
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case220 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS270
case221 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case222 NOOP; Switch Child branch
  LDR R0 #case222
  STR R0 $e; EnterNode storing statecode : 0
  LDR R0 #case223
  STR R0 $e; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS220
case223 NOOP; Switch Child branch
  LDR R0 #case223
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #case224
  STR R0 $e; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else357 ;checking if the signal is present G_1
  LDR R0 #case225
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE358
else357 NOOP
  LDR R0 #case226
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE358 NOOP;
  JMP ENDS221
case224 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case225 NOOP; Switch Child branch
  LDR R0 #case220
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS240
case226 NOOP; Switch Child branch
  LDR R0 #case226
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #case220
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS241
ENDS240 NOOP 
ENDS241 NOOP 
  JMP ENDS222
ENDS220 NOOP 
ENDS221 NOOP 
ENDS222 NOOP 
  JMP ENDS271
ENDS270 NOOP 
ENDS271 NOOP 
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case227 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS330
case228 NOOP; Switch Child branch
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case229 NOOP; Switch Child branch
  LDR R0 #case229
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else365 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case230
  STR R0 $11; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE366
else365 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case230
  STR R0 $11; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE366 NOOP;
  JMP ENDS280
case230 NOOP; Switch Child branch
  LDR R0 #case230
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 #case227
  STR R0 $10; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS281
ENDS280 NOOP 
ENDS281 NOOP 
  JMP ENDS331
ENDS330 NOOP 
ENDS331 NOOP 
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case231 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS390
case232 NOOP; Switch Child branch
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case233 NOOP; Switch Child branch
  LDR R0 #case233
  STR R0 $13; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE372; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE372 PRESENT R1 FALSE373; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE373
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else371 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case234
  STR R0 $13; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE374
else371 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case234
  STR R0 $13; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE374 NOOP;
  JMP ENDS340
case234 NOOP; Switch Child branch
  LDR R0 #case234
  STR R0 $13; EnterNode storing statecode : 1
  LDR R0 #case231
  STR R0 $12; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS341
ENDS340 NOOP 
ENDS341 NOOP 
  JMP ENDS391
ENDS390 NOOP 
ENDS391 NOOP 
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case235 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS450
case236 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case237 NOOP; Switch Child branch
  LDR R0 #case237
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #case238
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS400
case238 NOOP; Switch Child branch
  LDR R0 #case238
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #case239
  STR R0 $15; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else380 ;checking if the signal is present G_1
  LDR R0 #case240
  STR R0 $16; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE381
else380 NOOP
  LDR R0 #case241
  STR R0 $16; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE381 NOOP;
  JMP ENDS401
case239 NOOP; Switch Child branch
    LDR R0 $16
  JMP R0 ; SwitchNode unconditional jump
case240 NOOP; Switch Child branch
  LDR R0 #case235
  STR R0 $14; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS420
case241 NOOP; Switch Child branch
  LDR R0 #case241
  STR R0 $16; EnterNode storing statecode : 1
  LDR R0 #case235
  STR R0 $14; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS421
ENDS420 NOOP 
ENDS421 NOOP 
  JMP ENDS402
ENDS400 NOOP 
ENDS401 NOOP 
ENDS402 NOOP 
  JMP ENDS451
ENDS450 NOOP 
ENDS451 NOOP 
    LDR R0 $17
  JMP R0 ; SwitchNode unconditional jump
case242 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS510
case243 NOOP; Switch Child branch
    LDR R0 $18
  JMP R0 ; SwitchNode unconditional jump
case244 NOOP; Switch Child branch
  LDR R0 #case244
  STR R0 $18; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else388 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case245
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE389
else388 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case245
  STR R0 $18; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE389 NOOP;
  JMP ENDS460
case245 NOOP; Switch Child branch
  LDR R0 #case245
  STR R0 $18; EnterNode storing statecode : 1
  LDR R0 #case242
  STR R0 $17; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS461
ENDS460 NOOP 
ENDS461 NOOP 
  JMP ENDS511
ENDS510 NOOP 
ENDS511 NOOP 
    LDR R0 $19
  JMP R0 ; SwitchNode unconditional jump
case246 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS570
case247 NOOP; Switch Child branch
    LDR R0 $1a
  JMP R0 ; SwitchNode unconditional jump
case248 NOOP; Switch Child branch
  LDR R0 #case248
  STR R0 $1a; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE395; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE395 PRESENT R1 FALSE396; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE396
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else394 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case249
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE397
else394 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case249
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE397 NOOP;
  JMP ENDS520
case249 NOOP; Switch Child branch
  LDR R0 #case249
  STR R0 $1a; EnterNode storing statecode : 1
  LDR R0 #case246
  STR R0 $19; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS521
ENDS520 NOOP 
ENDS521 NOOP 
  JMP ENDS571
ENDS570 NOOP 
ENDS571 NOOP 
    LDR R0 $1b
  JMP R0 ; SwitchNode unconditional jump
case250 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS630
case251 NOOP; Switch Child branch
    LDR R0 $1c
  JMP R0 ; SwitchNode unconditional jump
case252 NOOP; Switch Child branch
  LDR R0 #case252
  STR R0 $1c; EnterNode storing statecode : 0
  LDR R0 #case253
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS580
case253 NOOP; Switch Child branch
  LDR R0 #case253
  STR R0 $1c; EnterNode storing statecode : 1
  LDR R0 #case254
  STR R0 $1c; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else403 ;checking if the signal is present G_1
  LDR R0 #case255
  STR R0 $1d; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE404
else403 NOOP
  LDR R0 #case256
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE404 NOOP;
  JMP ENDS581
case254 NOOP; Switch Child branch
    LDR R0 $1d
  JMP R0 ; SwitchNode unconditional jump
case255 NOOP; Switch Child branch
  LDR R0 #case250
  STR R0 $1b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS600
case256 NOOP; Switch Child branch
  LDR R0 #case256
  STR R0 $1d; EnterNode storing statecode : 1
  LDR R0 #case250
  STR R0 $1b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS601
ENDS600 NOOP 
ENDS601 NOOP 
  JMP ENDS582
ENDS580 NOOP 
ENDS581 NOOP 
ENDS582 NOOP 
  JMP ENDS631
ENDS630 NOOP 
ENDS631 NOOP 
    LDR R0 $1e
  JMP R0 ; SwitchNode unconditional jump
case257 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS690
case258 NOOP; Switch Child branch
    LDR R0 $1f
  JMP R0 ; SwitchNode unconditional jump
case259 NOOP; Switch Child branch
  LDR R0 #case259
  STR R0 $1f; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else411 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case260
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE412
else411 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case260
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE412 NOOP;
  JMP ENDS640
case260 NOOP; Switch Child branch
  LDR R0 #case260
  STR R0 $1f; EnterNode storing statecode : 1
  LDR R0 #case257
  STR R0 $1e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS641
ENDS640 NOOP 
ENDS641 NOOP 
  JMP ENDS691
ENDS690 NOOP 
ENDS691 NOOP 
    LDR R0 $20
  JMP R0 ; SwitchNode unconditional jump
case261 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS750
case262 NOOP; Switch Child branch
    LDR R0 $21
  JMP R0 ; SwitchNode unconditional jump
case263 NOOP; Switch Child branch
  LDR R0 #case263
  STR R0 $21; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE418; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE418 PRESENT R1 FALSE419; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE419
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else417 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case264
  STR R0 $21; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE420
else417 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case264
  STR R0 $21; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE420 NOOP;
  JMP ENDS700
case264 NOOP; Switch Child branch
  LDR R0 #case264
  STR R0 $21; EnterNode storing statecode : 1
  LDR R0 #case261
  STR R0 $20; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS701
ENDS700 NOOP 
ENDS701 NOOP 
  JMP ENDS751
ENDS750 NOOP 
ENDS751 NOOP 
    LDR R0 $22
  JMP R0 ; SwitchNode unconditional jump
case265 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS810
case266 NOOP; Switch Child branch
    LDR R0 $23
  JMP R0 ; SwitchNode unconditional jump
case267 NOOP; Switch Child branch
  LDR R0 #case267
  STR R0 $23; EnterNode storing statecode : 0
  LDR R0 #case268
  STR R0 $23; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS760
case268 NOOP; Switch Child branch
  LDR R0 #case268
  STR R0 $23; EnterNode storing statecode : 1
  LDR R0 #case269
  STR R0 $23; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else426 ;checking if the signal is present G_1
  LDR R0 #case270
  STR R0 $24; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE427
else426 NOOP
  LDR R0 #case271
  STR R0 $24; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE427 NOOP;
  JMP ENDS761
case269 NOOP; Switch Child branch
    LDR R0 $24
  JMP R0 ; SwitchNode unconditional jump
case270 NOOP; Switch Child branch
  LDR R0 #case265
  STR R0 $22; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS780
case271 NOOP; Switch Child branch
  LDR R0 #case271
  STR R0 $24; EnterNode storing statecode : 1
  LDR R0 #case265
  STR R0 $22; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS781
ENDS780 NOOP 
ENDS781 NOOP 
  JMP ENDS762
ENDS760 NOOP 
ENDS761 NOOP 
ENDS762 NOOP 
  JMP ENDS811
ENDS810 NOOP 
ENDS811 NOOP 
    LDR R0 $25
  JMP R0 ; SwitchNode unconditional jump
case272 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS870
case273 NOOP; Switch Child branch
    LDR R0 $26
  JMP R0 ; SwitchNode unconditional jump
case274 NOOP; Switch Child branch
  LDR R0 #case274
  STR R0 $26; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else434 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case275
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE435
else434 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case275
  STR R0 $26; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE435 NOOP;
  JMP ENDS820
case275 NOOP; Switch Child branch
  LDR R0 #case275
  STR R0 $26; EnterNode storing statecode : 1
  LDR R0 #case272
  STR R0 $25; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS821
ENDS820 NOOP 
ENDS821 NOOP 
  JMP ENDS871
ENDS870 NOOP 
ENDS871 NOOP 
    LDR R0 $27
  JMP R0 ; SwitchNode unconditional jump
case276 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS930
case277 NOOP; Switch Child branch
    LDR R0 $28
  JMP R0 ; SwitchNode unconditional jump
case278 NOOP; Switch Child branch
  LDR R0 #case278
  STR R0 $28; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE441; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE441 PRESENT R1 FALSE442; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE442
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else440 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case279
  STR R0 $28; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE443
else440 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case279
  STR R0 $28; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE443 NOOP;
  JMP ENDS880
case279 NOOP; Switch Child branch
  LDR R0 #case279
  STR R0 $28; EnterNode storing statecode : 1
  LDR R0 #case276
  STR R0 $27; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS881
ENDS880 NOOP 
ENDS881 NOOP 
  JMP ENDS931
ENDS930 NOOP 
ENDS931 NOOP 
    LDR R0 $29
  JMP R0 ; SwitchNode unconditional jump
case280 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS990
case281 NOOP; Switch Child branch
    LDR R0 $2a
  JMP R0 ; SwitchNode unconditional jump
case282 NOOP; Switch Child branch
  LDR R0 #case282
  STR R0 $2a; EnterNode storing statecode : 0
  LDR R0 #case283
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS940
case283 NOOP; Switch Child branch
  LDR R0 #case283
  STR R0 $2a; EnterNode storing statecode : 1
  LDR R0 #case284
  STR R0 $2a; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else449 ;checking if the signal is present G_1
  LDR R0 #case285
  STR R0 $2b; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE450
else449 NOOP
  LDR R0 #case286
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE450 NOOP;
  JMP ENDS941
case284 NOOP; Switch Child branch
    LDR R0 $2b
  JMP R0 ; SwitchNode unconditional jump
case285 NOOP; Switch Child branch
  LDR R0 #case280
  STR R0 $29; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS960
case286 NOOP; Switch Child branch
  LDR R0 #case286
  STR R0 $2b; EnterNode storing statecode : 1
  LDR R0 #case280
  STR R0 $29; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS961
ENDS960 NOOP 
ENDS961 NOOP 
  JMP ENDS942
ENDS940 NOOP 
ENDS941 NOOP 
ENDS942 NOOP 
  JMP ENDS991
ENDS990 NOOP 
ENDS991 NOOP 
    LDR R0 $2c
  JMP R0 ; SwitchNode unconditional jump
case287 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1050
case288 NOOP; Switch Child branch
    LDR R0 $2d
  JMP R0 ; SwitchNode unconditional jump
case289 NOOP; Switch Child branch
  LDR R0 #case289
  STR R0 $2d; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else457 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case290
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE458
else457 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case290
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE458 NOOP;
  JMP ENDS1000
case290 NOOP; Switch Child branch
  LDR R0 #case290
  STR R0 $2d; EnterNode storing statecode : 1
  LDR R0 #case287
  STR R0 $2c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1001
ENDS1000 NOOP 
ENDS1001 NOOP 
  JMP ENDS1051
ENDS1050 NOOP 
ENDS1051 NOOP 
    LDR R0 $2e
  JMP R0 ; SwitchNode unconditional jump
case291 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1110
case292 NOOP; Switch Child branch
    LDR R0 $2f
  JMP R0 ; SwitchNode unconditional jump
case293 NOOP; Switch Child branch
  LDR R0 #case293
  STR R0 $2f; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE464; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE464 PRESENT R1 FALSE465; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE465
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else463 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case294
  STR R0 $2f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE466
else463 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case294
  STR R0 $2f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE466 NOOP;
  JMP ENDS1060
case294 NOOP; Switch Child branch
  LDR R0 #case294
  STR R0 $2f; EnterNode storing statecode : 1
  LDR R0 #case291
  STR R0 $2e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1061
ENDS1060 NOOP 
ENDS1061 NOOP 
  JMP ENDS1111
ENDS1110 NOOP 
ENDS1111 NOOP 
    LDR R0 $30
  JMP R0 ; SwitchNode unconditional jump
case295 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1170
case296 NOOP; Switch Child branch
    LDR R0 $31
  JMP R0 ; SwitchNode unconditional jump
case297 NOOP; Switch Child branch
  LDR R0 #case297
  STR R0 $31; EnterNode storing statecode : 0
  LDR R0 #case298
  STR R0 $31; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1120
case298 NOOP; Switch Child branch
  LDR R0 #case298
  STR R0 $31; EnterNode storing statecode : 1
  LDR R0 #case299
  STR R0 $31; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else472 ;checking if the signal is present G_1
  LDR R0 #case300
  STR R0 $32; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE473
else472 NOOP
  LDR R0 #case301
  STR R0 $32; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE473 NOOP;
  JMP ENDS1121
case299 NOOP; Switch Child branch
    LDR R0 $32
  JMP R0 ; SwitchNode unconditional jump
case300 NOOP; Switch Child branch
  LDR R0 #case295
  STR R0 $30; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1140
case301 NOOP; Switch Child branch
  LDR R0 #case301
  STR R0 $32; EnterNode storing statecode : 1
  LDR R0 #case295
  STR R0 $30; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1141
ENDS1140 NOOP 
ENDS1141 NOOP 
  JMP ENDS1122
ENDS1120 NOOP 
ENDS1121 NOOP 
ENDS1122 NOOP 
  JMP ENDS1171
ENDS1170 NOOP 
ENDS1171 NOOP 
    LDR R0 $33
  JMP R0 ; SwitchNode unconditional jump
case302 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1230
case303 NOOP; Switch Child branch
    LDR R0 $34
  JMP R0 ; SwitchNode unconditional jump
case304 NOOP; Switch Child branch
  LDR R0 #case304
  STR R0 $34; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else480 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case305
  STR R0 $34; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE481
else480 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case305
  STR R0 $34; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE481 NOOP;
  JMP ENDS1180
case305 NOOP; Switch Child branch
  LDR R0 #case305
  STR R0 $34; EnterNode storing statecode : 1
  LDR R0 #case302
  STR R0 $33; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1181
ENDS1180 NOOP 
ENDS1181 NOOP 
  JMP ENDS1231
ENDS1230 NOOP 
ENDS1231 NOOP 
    LDR R0 $35
  JMP R0 ; SwitchNode unconditional jump
case306 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1290
case307 NOOP; Switch Child branch
    LDR R0 $36
  JMP R0 ; SwitchNode unconditional jump
case308 NOOP; Switch Child branch
  LDR R0 #case308
  STR R0 $36; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE487; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE487 PRESENT R1 FALSE488; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE488
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else486 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case309
  STR R0 $36; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE489
else486 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case309
  STR R0 $36; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE489 NOOP;
  JMP ENDS1240
case309 NOOP; Switch Child branch
  LDR R0 #case309
  STR R0 $36; EnterNode storing statecode : 1
  LDR R0 #case306
  STR R0 $35; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1241
ENDS1240 NOOP 
ENDS1241 NOOP 
  JMP ENDS1291
ENDS1290 NOOP 
ENDS1291 NOOP 
    LDR R0 $37
  JMP R0 ; SwitchNode unconditional jump
case310 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1350
case311 NOOP; Switch Child branch
    LDR R0 $38
  JMP R0 ; SwitchNode unconditional jump
case312 NOOP; Switch Child branch
  LDR R0 #case312
  STR R0 $38; EnterNode storing statecode : 0
  LDR R0 #case313
  STR R0 $38; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1300
case313 NOOP; Switch Child branch
  LDR R0 #case313
  STR R0 $38; EnterNode storing statecode : 1
  LDR R0 #case314
  STR R0 $38; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else495 ;checking if the signal is present G_1
  LDR R0 #case315
  STR R0 $39; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE496
else495 NOOP
  LDR R0 #case316
  STR R0 $39; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE496 NOOP;
  JMP ENDS1301
case314 NOOP; Switch Child branch
    LDR R0 $39
  JMP R0 ; SwitchNode unconditional jump
case315 NOOP; Switch Child branch
  LDR R0 #case310
  STR R0 $37; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1320
case316 NOOP; Switch Child branch
  LDR R0 #case316
  STR R0 $39; EnterNode storing statecode : 1
  LDR R0 #case310
  STR R0 $37; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1321
ENDS1320 NOOP 
ENDS1321 NOOP 
  JMP ENDS1302
ENDS1300 NOOP 
ENDS1301 NOOP 
ENDS1302 NOOP 
  JMP ENDS1351
ENDS1350 NOOP 
ENDS1351 NOOP 
    LDR R0 $3a
  JMP R0 ; SwitchNode unconditional jump
case317 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1410
case318 NOOP; Switch Child branch
    LDR R0 $3b
  JMP R0 ; SwitchNode unconditional jump
case319 NOOP; Switch Child branch
  LDR R0 #case319
  STR R0 $3b; EnterNode storing statecode : 0
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else503 ;checking if the signal is present A_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal B_1 in mem
    LDR R0 #case320
  STR R0 $3b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE504
else503 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal C2_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal C3_1 in mem
    LDR R0 #case320
  STR R0 $3b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE504 NOOP;
  JMP ENDS1360
case320 NOOP; Switch Child branch
  LDR R0 #case320
  STR R0 $3b; EnterNode storing statecode : 1
  LDR R0 #case317
  STR R0 $3a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1361
ENDS1360 NOOP 
ENDS1361 NOOP 
  JMP ENDS1411
ENDS1410 NOOP 
ENDS1411 NOOP 
    LDR R0 $3c
  JMP R0 ; SwitchNode unconditional jump
case321 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1470
case322 NOOP; Switch Child branch
    LDR R0 $3d
  JMP R0 ; SwitchNode unconditional jump
case323 NOOP; Switch Child branch
  LDR R0 #case323
  STR R0 $3d; EnterNode storing statecode : 0
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $5; loading dsig signal 16-bit (RIGHT)
  AND R1 R1 #256; Anding to get the right signal bit F_1
  LDR R0 $5; loading dsig signal 16-bit (LEFT)
  AND R0 R0 #1024; Anding to get the right signal bit D_1
  PRESENT R0 FALSE510; testing whether it is true - LogicalOr
  OR R2 R2 #1; result is true - LogicalOr
FALSE510 PRESENT R1 FALSE511; testing whether it is true - LogicalOr 
  OR R2 R2 #1; result is true - LogicalOr
FALSE511
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else509 ;checking if the signal is present D_1.getprestatus() || F_1.getprestatus()
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal E_1 in mem
    LDR R0 #case324
  STR R0 $3d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE512
else509 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal F_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal G_1 in mem
    LDR R0 #case324
  STR R0 $3d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE512 NOOP;
  JMP ENDS1420
case324 NOOP; Switch Child branch
  LDR R0 #case324
  STR R0 $3d; EnterNode storing statecode : 1
  LDR R0 #case321
  STR R0 $3c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1421
ENDS1420 NOOP 
ENDS1421 NOOP 
  JMP ENDS1471
ENDS1470 NOOP 
ENDS1471 NOOP 
    LDR R0 $3e
  JMP R0 ; SwitchNode unconditional jump
case325 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1530
case326 NOOP; Switch Child branch
    LDR R0 $3f
  JMP R0 ; SwitchNode unconditional jump
case327 NOOP; Switch Child branch
  LDR R0 #case327
  STR R0 $3f; EnterNode storing statecode : 0
  LDR R0 #case328
  STR R0 $3f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1480
case328 NOOP; Switch Child branch
  LDR R0 #case328
  STR R0 $3f; EnterNode storing statecode : 1
  LDR R0 #case329
  STR R0 $3f; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #128 ;Got the exact signal
  PRESENT R0 else518 ;checking if the signal is present G_1
  LDR R0 #case330
  STR R0 $40; EnterNode storing statecode : 0
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal C1_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE519
else518 NOOP
  LDR R0 #case331
  STR R0 $40; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE519 NOOP;
  JMP ENDS1481
case329 NOOP; Switch Child branch
    LDR R0 $40
  JMP R0 ; SwitchNode unconditional jump
case330 NOOP; Switch Child branch
  LDR R0 #case325
  STR R0 $3e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1500
case331 NOOP; Switch Child branch
  LDR R0 #case331
  STR R0 $40; EnterNode storing statecode : 1
  LDR R0 #case325
  STR R0 $3e; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1501
ENDS1500 NOOP 
ENDS1501 NOOP 
  JMP ENDS1482
ENDS1480 NOOP 
ENDS1481 NOOP 
ENDS1482 NOOP 
  JMP ENDS1531
ENDS1530 NOOP 
ENDS1531 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N52301
  SUBV R1 R0 #0
  PRESENT R1 N5230
N52301 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY523;
N5230 NOOP 
  LDR R0 #case209
  STR R0 $8; EnterNode storing statecode : 0
  LDR R0 #case209
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY523;
DUMMY523
  JMP ENDS1552
ENDS1550 NOOP 
ENDS1551 NOOP 
ENDS1552 NOOP 
END0 JMP BEGIN0
  ENDPROG
