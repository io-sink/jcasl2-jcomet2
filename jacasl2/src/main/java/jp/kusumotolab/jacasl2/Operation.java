package jp.kusumotolab.jacasl2;

public enum Operation {
  NOP(0x00, ArgType.NoArg), LD2(0x10, ArgType.RAdrX), ST(0x11, ArgType.RAdrX), LAD(0x12,
      ArgType.RAdrX), LD1(0x14, ArgType.R1R2), ADDA2(0x20, ArgType.RAdrX), SUBA2(0x21,
          ArgType.RAdrX), ADDL2(0x22, ArgType.RAdrX), SUBL2(0x23, ArgType.RAdrX), ADDA1(0x24,
              ArgType.R1R2), SUBA1(0x25, ArgType.R1R2), ADDL1(0x26, ArgType.R1R2), SUBL1(0x27,
                  ArgType.R1R2), AND2(0x30, ArgType.RAdrX), OR2(0x31, ArgType.RAdrX), XOR2(0x32,
                      ArgType.RAdrX), AND1(0x34, ArgType.R1R2), OR1(0x35, ArgType.R1R2), XOR1(0x36,
                          ArgType.R1R2), CPA2(0x40, ArgType.RAdrX), CPL2(0x41, ArgType.RAdrX), CPA1(
                              0x44, ArgType.R1R2), CPL1(0x45, ArgType.R1R2), SLA(0x50,
                                  ArgType.RAdrX), SRA(0x51, ArgType.RAdrX), SLL(0x52,
                                      ArgType.RAdrX), SRL(0x53, ArgType.RAdrX), JMI(0x61,
                                          ArgType.AdrX), JNZ(0x62, ArgType.AdrX), JZE(0x63,
                                              ArgType.AdrX), JUMP(0x64, ArgType.AdrX), JPL(0x65,
                                                  ArgType.AdrX), JOV(0x66, ArgType.AdrX), PUSH(0x70,
                                                      ArgType.AdrX), POP(0x71, ArgType.R), CALL(
                                                          0x80, ArgType.AdrX), RET(0x81,
                                                              ArgType.NoArg), SVC(0xf0,
                                                                  ArgType.AdrX), IN(0x90,
                                                                      ArgType.StrLen), OUT(0x91,
                                                                          ArgType.StrLen), RPUSH(
                                                                              0xa0,
                                                                              ArgType.NoArg), RPOP(
                                                                                  0xa1,
                                                                                  ArgType.NoArg), LD(
                                                                                      -1,
                                                                                      null), ADDA(
                                                                                          -2,
                                                                                          null), SUBA(
                                                                                              -3,
                                                                                              null), ADDL(
                                                                                                  -4,
                                                                                                  null), SUBL(
                                                                                                      -5,
                                                                                                      null), AND(
                                                                                                          -6,
                                                                                                          null), OR(
                                                                                                              -7,
                                                                                                              null), XOR(
                                                                                                                  -8,
                                                                                                                  null), CPA(
                                                                                                                      -9,
                                                                                                                      null), CPL(
                                                                                                                          -10,
                                                                                                                          null), START(
                                                                                                                              -100,
                                                                                                                              ArgType.Start), END(
                                                                                                                                  -101,
                                                                                                                                  null), DS(
                                                                                                                                      0,
                                                                                                                                      ArgType.Ds), DC(
                                                                                                                                          0,
                                                                                                                                          ArgType.Dc);

  public final int code;
  public final ArgType argType;

  Operation(int code, ArgType argType) {
    this.code = code;
    this.argType = argType;
  }
}
