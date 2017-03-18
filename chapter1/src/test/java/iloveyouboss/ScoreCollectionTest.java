package iloveyouboss;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by felipe.affonso on 17/03/17.
 */
public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOneNumber() throws Exception {
        //Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);

        //Act
        int actualResult = collection.arithmeticMean();

        //Assert
        assertThat(actualResult, equalTo(5));
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        //Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //Act
        int actualResult = collection.arithmeticMean();

        //Assert
        assertThat(actualResult, equalTo(6));
    }

    @Test
    public void answersArithmeticMeanOfThreeNumbers() {
        //Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 6);
        collection.add(() -> 7);

        //Act
        int actualResult = collection.arithmeticMean();

        //Assert
        assertThat(actualResult, equalTo(6));
    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionAddingNullScoreable() {
        //Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(null);

        //Act
        collection.arithmeticMean();

        //Assert
    }

    @Test(expected = ArithmeticException.class)
    public void throwExceptionCalculatingWithoutScoreables() throws Exception {
    //Arrange
        ScoreCollection collection = new ScoreCollection();

        //Act
        collection.arithmeticMean();

        //Assert
    }
}