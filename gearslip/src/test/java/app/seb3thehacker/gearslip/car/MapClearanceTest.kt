package app.seb3thehacker.gearslip.car

import org.junit.Assert.*
import org.junit.Test

class MapClearanceTest {
    @Test fun `auto keeps clear only a map that ignores the visible area`() {
        assertTrue(MapClearance.AUTO.appliesTo(ignoresVisibleArea = true))
        assertFalse(MapClearance.AUTO.appliesTo(ignoresVisibleArea = false))
    }

    @Test fun `on and off apply to every map alike`() {
        assertTrue(MapClearance.ON.appliesTo(ignoresVisibleArea = false))
        assertTrue(MapClearance.ON.appliesTo(ignoresVisibleArea = true))
        assertFalse(MapClearance.OFF.appliesTo(ignoresVisibleArea = true))
        assertFalse(MapClearance.OFF.appliesTo(ignoresVisibleArea = false))
    }
}
