// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    

    // Write four more tests here

    "for a list only containing one element, that element should be the median" {
        median(listOf(3f)) shouldBe 3f
    }

    "works for a list containing 2 elements"{
        median(listOf(3f, 5f)) shouldBe 4f
    }

    "works for a list containing 3 elements"{
        median(listOf(3f, 7f, 5f)) shouldBe 5f
    }

    "works for a list containing 4 elements"{
        median(listOf(9f, 5f, 7f, 3f)) shouldBe 6f
    }

    


   

})
