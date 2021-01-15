package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class SUBL1 extends Instruction {

  public SUBL1(JComet2 machine) {
    super(machine, 0x27, "SUBL", ArgType.R1R2);
  }

  @Override
  public void execute() {
    int[] r1r2 = getR1R2();
    int r1 = r1r2[0];
    int r2 = r1r2[1];
    int result = this.m.GR[r1] - this.m.GR[r2];
    this.m.GR[r1] = result & 0xffff;
    this.updateFlags(result, true);
    this.m.PR += 1;
  }

  @Override
  public int getCost() {
	  return 1;
  }
}
