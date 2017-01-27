package com.giftservice.controller;

import com.giftservice.exception.SimpleRestException;
import com.giftservice.protocol.ResponseObject;
import com.giftservice.protocol.request.*;
import com.giftservice.protocol.response.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
public class GiftServiceRestController {

    private static Logger log = LogManager.getLogger(GiftServiceRestController.class);
    private static final String LOGIN = "/login";
    private static final String QUESTION = "/question";
    private static final String ANSWER = "/answer";
    private static final String GIFT_CATEGORY = "/giftCategory";
    private static final String FLAG_GIFT_CATEGORY = "/flagGiftCategory";
    private static final String GIFT_RESULT = "/giftResult";
    private static final String SWIPE_RESULT = "/swipeResult";


    @PostMapping(value = LOGIN, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject login(@RequestBody final LoginRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        UserResponse userResponse = new UserResponse();
        userResponse.setAbout("About something");
        userResponse.setBirthday("01-01-1990");
        userResponse.setFirstName("Bencito");
        userResponse.setGender("Male");
        userResponse.setGiftUserId("123456");
        userResponse.setId("1");
        userResponse.setLastName("Varga");
        userResponse.setLocale("UK");

        parameters.put("response", "SUCCESS");
        parameters.put("userResponse", userResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }

    @PostMapping(value = QUESTION, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject question(@RequestBody final QuestionRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        QuestionResponse questionResponse = new QuestionResponse();
        Question question = new Question();
        question.setAge(30);
        question.setMoney(new BigDecimal(100L));
        question.setPurpose("Birthday");
        question.setSex("MALE");
        List<Question> listQuestions = new ArrayList<Question>();
        listQuestions.add(question);

        questionResponse.setQuestions(listQuestions);
        parameters.put("response", "SUCCESS");
        parameters.put("questionResponse", questionResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }


    @PostMapping(value = ANSWER, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject answer(@RequestBody final AnswerRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        AnswerResponse answerResponse = new AnswerResponse();
        answerResponse.setResult("OK");
        parameters.put("response", "SUCCESS");
        parameters.put("answerResponse", answerResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }

    @GetMapping (value = GIFT_CATEGORY, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject giftCategory() throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        GiftCategoryResponse giftCategoryResponse = new GiftCategoryResponse();
        Category category1 = new Category(1, "hitech", "http://schioppa.com/image1.png");
        Category category2 = new Category(2, "gardening", "http://schioppaBazMeg.com/image1.png");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);
        giftCategoryResponse.setListCategory(categoryList);
        giftCategoryResponse.setResult("OK");
        parameters.put("response", "SUCCESS");
        parameters.put("answerResponse", giftCategoryResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }

    @PostMapping(value = FLAG_GIFT_CATEGORY, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject flagGiftCategory(@RequestBody final FlagGiftCategoryRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        FlagGiftCategoryResponse flagGiftCategoryResponse = new FlagGiftCategoryResponse();
        flagGiftCategoryResponse.setResult("OK");
        parameters.put("response", "SUCCESS");
        parameters.put("answerResponse", flagGiftCategoryResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }

    @PostMapping(value = GIFT_RESULT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject giftResult(@RequestBody final GiftResultRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        GiftResultResponse giftResultResponse = new GiftResultResponse();
        AmazonDetail amazonDetail1 = new AmazonDetail(1, "AMAZON_ID_1",
                "http://amazon.com/images/imagesSchioppa1", 100, "http://amazon.com/products/product1");

        AmazonDetail amazonDetail2 = new AmazonDetail(2, "AMAZON_ID_2",
                "http://amazon.com/images/imagesSchioppa2", 200, "http://amazon.com/products/product2");

        List<AmazonDetail> amazonDetailList = new ArrayList<>();
        amazonDetailList.add(amazonDetail1);
        amazonDetailList.add(amazonDetail2);
        giftResultResponse.setAmazonDetails(amazonDetailList);
        giftResultResponse.setResult("OK");
        parameters.put("response", "SUCCESS");
        parameters.put("answerResponse", giftResultResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }

    @PostMapping(value = SWIPE_RESULT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseObject swipeResult(@RequestBody final SwipeRequest request) throws SimpleRestException {
        ResponseObject response = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        SwipeResponse swipeResponse= new SwipeResponse();
        swipeResponse.setResult("OK");
        parameters.put("response", "SUCCESS");
        parameters.put("answerResponse", swipeResponse);
        response = ResponseObject.responseSuccess("1", parameters);
        return response;
    }
}

