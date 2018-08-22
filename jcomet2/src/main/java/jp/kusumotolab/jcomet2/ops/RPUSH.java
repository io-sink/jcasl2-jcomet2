package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class RPUSH extends Instruction {

  public RPUSH(JComet2 machine) {
    super(machine, 0xa0, "RPUSH", ArgType.NoArg);
  }

  @Override
  public void execute() {
    for (int i = 1; i < 9; i++) {
      this.m.setSP(this.m.getSP() - 1);
      this.m.memory[this.m.getSP()] = this.m.GR[i];
    }
    this.m.PR += 1;
  }
}
