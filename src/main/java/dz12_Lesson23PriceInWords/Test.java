package src.main.java.dz12_Lesson23PriceInWords;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.platform.engine.FilterResult;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryListener;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;
import org.junit.platform.launcher.PostDiscoveryFilter;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherConfig;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.reporting.legacy.xml.LegacyXmlReportGeneratingListener;

import org.junit.runners.ParameterizedTest;
import org.junit.*;
import org.junit.jupiter.api;
import org.junit.jupiter.params.ParameterizedTest;

import src.main.java.dz12_Lesson23PriceInWords.services.Currency;
import src.main.java.dz12_Lesson23PriceInWords.services.PriceInWordsImpl;


public class Test {
    public static void main(String[] args) {
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
        //@ValueSource(strings = {"Abc", "De", "Fghj"})
        //@NullSource       // Данная Аннатация Передает значение NULL
        //@EmptySource       // Данная Аннатация Передает значение ПУСТО
        void test(int number){
            PriceInWordsImpl priceInWords = new PriceInWordsImpl();
            Currency instance = Currency.valueOf("RUB");
            assertTrue(priceInWords.transformation(number, instance));
            assertEquals(priceInWords.transformation(1, instance), "один рубль");
        }
        @ParameterizedTest
        @CsvSource({"1, 'один рубль'", "3, 'три рубля'", "7, 'семь рублей'"})
        void test(int number, String s){
            PriceInWordsImpl priceInWords = new PriceInWordsImpl();
            Currency instance = Currency.valueOf("RUB");
            assertEquals(priceInWords.transformation(number, instance), s);
        }
        @Test
        void testSpace(){
            assertEquals(1, "RUB");
        }
    }
}
