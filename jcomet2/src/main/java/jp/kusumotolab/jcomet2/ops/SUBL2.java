package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class SUBL2 extends Instruction {

  public SUBL2(JComet2 machine) {
    super(machine, 0x23, "SUBL", ArgType.RAdrX);
  }

  @Override
  public void execute() {
    int[] radrx = getRAdRx();
    int r = radrx[0];
    int adr = radrx[1];
    int x = radrx[2];
    int v = this.getValueAtEffectiveAddress(adr, x);
    int result = this.m.GR[r] - v;
    this.m.GR[r] = result & 0xffff;
    this.updateFlags(result, true);
    m.PR += 2;
  }

  @Override
  public int getCost() {
	  return 3;
  }
}
