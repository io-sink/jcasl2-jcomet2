package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class SLL extends Instruction {

  public SLL(JComet2 machine) {
    super(machine, 0x52, "SLL", ArgType.RAdrX);
  }

  @Override
  public void execute() {
    int[] radrx = getRAdRx();
    int r = radrx[0];
    int adr = radrx[1];
    int x = radrx[2];
    int v = this.getEffectiveAddress(adr, x);
    int p = this.m.GR[r];
    int ans = (p << v) & 0xffff;
    this.m.GR[r] = ans;
    this.updateFlags(this.m.GR[r], true);
    if (0 < v) {
      this.m.OF = getBit(p, 15 - (v - 1));
    }
    this.m.PR += 2;
  }

  @Override
  public int getCost() {
	  return 2;
  }
}
