package jp.kusumotolab.jcomet2.ops;

import jp.kusumotolab.jcomet2.JComet2;

public class LD2 extends Instruction {

  public LD2(JComet2 machine) {
    super(machine, 0x10, "LD", ArgType.RAdrX);
  }

  @Override
  public void execute() {
    int[] radrx = getRAdRx();
    int r = radrx[0];
    int adr = radrx[1];
    int x = radrx[2];
    m.GR[r] = getValueAtEffectiveAddress(adr, x);
    updateFlags(m.GR[r]);
    m.OF = 0;
    m.PR += 2;
  }

  @Override
  public int getCost() {
	  return 3;
  }
}
