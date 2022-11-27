import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    OrderPage orderPage = new OrderPage(driver);

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String site = "https://qa-scooter.praktikum-services.ru/";

    public void openSite() {
        driver.get(site);
    }
    public String QuestionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String QuestionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String QuestionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String QuestionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String QuestionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String QuestionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String QuestionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String QuestionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public By scrollQuestions = By.id("accordion__heading-0");
    public By QuestionOne = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    public By QuestionTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    public By QuestionThree = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    public By QuestionFour = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    public By QuestionFive = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    public By QuestionSix = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    public By QuestionSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    public By QuestionEight = By.xpath(".//div[@aria-controls='accordion__panel-7']");

    public void scrollToImportantQuestions() { //скролл до элемента FAQ
        WebElement element = driver.findElement(scrollQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void standBy(By element) {
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void clickButtonOneQuestion() {
        standBy(QuestionOne);
        driver.findElement(QuestionOne).click();
    }

    public void clickButtonTwoQuestion() {
        standBy(QuestionTwo);
        driver.findElement(QuestionTwo).click();
    }

    public void clickButtonThreeQuestion() {
        driver.findElement(QuestionThree).click();
    }

    public void clickButtonFourQuestion() {
        standBy(QuestionFour);
        driver.findElement(QuestionFour).click();
    }

    public void clickButtonFiveQuestion() {
        standBy(QuestionFive);
        driver.findElement(QuestionFive).click();
    }

    public void clickButtonSixQuestion() {
        standBy(QuestionSix);
        driver.findElement(QuestionSix).click();
    }

    public void clickButtonSevenQuestion() {
        standBy(QuestionSeven);
        driver.findElement(QuestionSeven).click();
    }

    public void clickButtonEightQuestion() {
        standBy(QuestionEight);
        driver.findElement(QuestionEight).click();
    }
}
