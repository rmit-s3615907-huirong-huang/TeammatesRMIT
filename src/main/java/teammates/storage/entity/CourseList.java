package teammates.storage.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Here i generate a list of courses available or instructors to chose from
 * the format is (course id - course name)
 * Don't mind the alphabetical order since Collection.sort method is called at the end.
 */

public class CourseList {

    public List<String> getCourses() {

        List<String> list = new ArrayList<String>();
        list.add("ACCT1044 - Accounting in Organisations and Society");
        list.add("ACCT2087 - Business Frameworks");
        list.add("ACCT2088 - Business Simulation Game");
        list.add("BIOL1214 - Biomedical and Physical Sciences 2");
        list.add("BUSM2283 - Organisations and their Environments");
        list.add("BUSM2285 - Leadership and Management Skills");
        list.add("BUSM2294 - Business Case Study");
        list.add("BUSM4366 - e Retail for Fashion");
        list.add("BUSM4561 - Work in Global Society");
        list.add("BUSM4721 - Global Fashion Enterprise");
        list.add("COMM2602 - Visual Literacy for Digital Media");
        list.add("COSC2166 - Web Media Technologies");
        list.add("COSC2171 - Web Servers and Web Technology");
        list.add("COSC2291 - Web Page Construction");
        list.add("COSC2430 - Web Programming");
        list.add("COSC2450 - Web Development Technologies");
        list.add("COSC2504 - Web/Internet Project 1");
        list.add("COSC2505 - Web/Internet Project 2");
        list.add("GRAP2163 - Global Entrepreneurship Strategies in Fashion");
        list.add("GRAP2164 - Production Management for Fashion and Textiles");
        list.add("GRAP2165 - Product Development Strategies");
        list.add("GRAP2166 - Textile Industry and Textile Manufacturing Economics");
        list.add("GRAP2334 - Digital Textile Design and Communication");
        list.add("GRAP2335 - Digital Textile Design and Illustration");
        list.add("GRAP2342 - Digital Textile Design and Storytelling");
        list.add("GRAP2343 - Digital Textile Design and the Marketplace");
        list.add("GRAP2348 - Digital Textile Design and Industry");
        list.add("GRAP2388 - Trend Forecasting for Fashion");
        list.add("GRAP2389 - Digital Communication for Fashion");
        list.add("GRAP2391 - Fashion Entrepreneurship - Major Project");
        list.add("GRAP2411 - Visual Language");
        list.add("GRAP2428 - Advanced Case Studies in Fashion Entrepreneurship");
        list.add("GRAP2442 - Advanced IT Fashion Illustration and Information Systems");
        list.add("GRAP2466 - Design and Development 2");
        list.add("GRAP2467 - Design and Development 3");
        list.add("GRAP2471 - Design and Development 1");
        list.add("GRAP2472 - Design and Development 4");
        list.add("GRAP2526 - Drawing and Digital Illustration");
        list.add("GRAP2527 - Digital Design Production");
        list.add("GRAP2528 - Applied Typography");
        list.add("GRAP2530 - Advanced Illustration Techniques");
        list.add("GRAP2534 - 2D and 3D Design Production 1");
        list.add("GRAP2536 - Digital Publishing");
        list.add("GRAP2539 - 2D and 3D Design Production 2");
        list.add("GRAP2540 - Design Industry Engagement");
        list.add("GRAP2564 - Sustainable Product Design and Development for Fashion");
        list.add("GRAP2613 - Research Strategies for Fashion");
        list.add("GRAP2737 - Visual Vocabulary - Typography, Colour & Composition");
        list.add("GRAP2760 - Contemporary Fashion Contexts");
        list.add("GRAP2761 - Digital Design 2");
        list.add("GRAP2762 - Digital Design 1");
        list.add("LANG1265 - Vietnamese for Professional Communication");
        list.add("LAW2535 - Vietnamese Taxation Law");
        list.add("MANU1449 - Cotton Spinning");
        list.add("MANU1462 - Dyeing and Finishing Technology");
        list.add("MANU2030 - Dyeing Practices");
        list.add("MANU2091 - Textile Product Development and Engineering");
        list.add("MANU2092 - Textiles");
        list.add("MANU2094 - Advanced Pattern Technology");
        list.add("MANU2154 - Advanced Textile Materials and New Technologies");
        list.add("MANU2184 - Sportswear and Performance Textiles");
        list.add("MANU2226 - Fibre to Fabric Product Knowledge");
        list.add("MANU2227 - Fabric to Fashion Product Knowledge");
        list.add("MKTG1204 - Fashion and Textiles Marketing");
        list.add("MKTG1290 - Fashion Merchandise Management");
        list.add("MKTG1291 - Fashion Retail Management Strategies");
        list.add("MKTG1310 - Fashion Entrepreneurship");
        list.add("MKTG1314 - Fashion Brand Management");
        list.add("MKTG1374 - Marketing for Fashion Entrepreneurs");
        list.add("NURS1128 - Medical Surgical Nursing");
        list.add("NURS2002 - Crisis Care Nursing");
        list.add("NURS2026 - Medical Nursing");
        list.add("NURS2036 - Surgical Nursing");
        list.add("OART1035 - Visual Effects");
        list.add("OMGT2192 - Global Fashion Supply Chains");
        list.add("OMGT2196 - Warehouse and Distribution Channels");
        list.add("TCHE2284 - Curriculum and Assessment");
        list.add("TCHE2358 - Applied Education Project");
        list.add("TCHE2497 - Curriculum, Assessment and Reporting");
        list.add("TCHE2503 - Discovering Science");
        list.add("TCHE2507 - Early Literacy Foundation to Year 2");
        list.add("TCHE2510 - Developing a sense of number");
        list.add("TCHE2512 - Professional Experience: Inclusive Education");
        list.add("TCHE2513 - Critical Issues in School Mathematics");
        list.add("TCHE2515 - Developing Literacy: 3-6");
        list.add("TCHE2588 - Cross-Cultural Teaching and Learning");
        list.add("TCHE2590 - Cross-Cultural Teaching and Learning");
        list.add("TCHE2591 - Introduction to STEM Education");
        list.add("VART3660 - Vietnamese Photography Studio: Ho Chi Minh City through the lens");
        list.add("BUSM2295 - Textile Quality Management");
        list.add("BUSM2367 - The Business Enterprise 1");
        list.add("BUSM2370 - The Business Enterprise 2");
        list.add("BUSM3136 - Applied Computer Applications");
        list.add("BUSM3138 - Building a Winning Team");
        list.add("BUSM3139 - Industrial Organisation and Management (Textile)");
        list.add("BUSM3150 - Applied Management");
        list.add("BUSM3293 - Leadership and Management");
        list.add("BUSM4184 - Luxury Fashion Business Management");
        /**
         * The method to sort courses
         * */
        Collections.sort(list);
        /**
         * The option other
         * */
        list.add("OTHER");
        return list;
    }
}
