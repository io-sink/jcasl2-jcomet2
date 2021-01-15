package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class CPA1 extends Instruction {

  public CPA1(JComet2 machine) {
    super(machine, 0x44, "CPA", ArgType.R1R2);
  }

  @Override
  public void execute() {
    int[] r1r2 = getR1R2();
    int r1 = r1r2[0];
    int r2 = r1r2[1];
    int diff = l2a(this.m.GR[r1]) - l2a(this.m.GR[r2]);
    this.m.SF = diff >= 0 ? 0 : 1;
    this.m.ZF = diff == 0 ? 1 : 0;
    this.m.OF = 0;
    this.m.PR += 1;
  }

  @Override
  public int getCost() {
	  return 1;
  }
}
