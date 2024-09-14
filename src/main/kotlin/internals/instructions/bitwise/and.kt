package internals.instructions.bitwise

import org.example.data.registers.enumIdenifiers.SuperRegisterType
import org.example.helpers.fullRegisterRead
import org.example.helpers.fullRegisterWrite


fun Bitwise.and(operand1: SuperRegisterType, operand2: SuperRegisterType) {
    fullRegisterWrite(
        SuperRegisterType.R3,
        fullRegisterRead(operand1) and fullRegisterRead(operand2)
    )
}