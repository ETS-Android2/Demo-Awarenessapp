package pg.abir.awarenesscampaignapp;

import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionanswer);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Question & Answer) </font></small>"));


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List<ParentData> list = getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter(QuestionAnswerActivity.this,list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);

    }

    private List<ParentData> getList() {

        List<ParentData> list_parent =new ArrayList<>();
        List<ChildData> list_data_child1 = new ArrayList<>();
        List<ChildData> list_data_child2 = new ArrayList<>();
        List<ChildData> list_data_child3 = new ArrayList<>();
        List<ChildData> list_data_child4 = new ArrayList<>();
        List<ChildData> list_data_child5 = new ArrayList<>();
        List<ChildData> list_data_child6 = new ArrayList<>();
        List<ChildData> list_data_child7 = new ArrayList<>();
        List<ChildData> list_data_child8 = new ArrayList<>();
        List<ChildData> list_data_child9 = new ArrayList<>();
        List<ChildData> list_data_child10 = new ArrayList<>();
        List<ChildData> list_data_child11 = new ArrayList<>();
        List<ChildData> list_data_child12 = new ArrayList<>();
        List<ChildData> list_data_child13 = new ArrayList<>();
        List<ChildData> list_data_child14 = new ArrayList<>();
        List<ChildData> list_data_child15 = new ArrayList<>();

        list_parent.add(new ParentData("1). What is a coronavirus?",list_data_child1));
        list_data_child1.clear();
        list_data_child1.add(new ChildData(" Coronaviruses are a large family of viruses which may cause illness in animals or humans.\n\n In humans, several coronaviruses are known to cause respiratory infections ranging from the common cold to more severe diseases such as Middle East Respiratory Syndrome (MERS) and Severe Acute Respiratory Syndrome (SARS).\n\n The most recently discovered coronavirus causes coronavirus disease COVID-19."));


        list_parent.add(new ParentData("2). What is COVID-19?",list_data_child2));
        list_data_child2.clear();
        list_data_child2.add(new ChildData(" COVID-19 is the infectious disease caused by the most recently discovered coronavirus. This new virus and disease were unknown before the outbreak began in Wuhan, China, in December 2019. COVID-19 is now a pandemic affecting many countries globally."));

        list_parent.add(new ParentData("3). What are the symptoms of COVID-19?",list_data_child3));
        list_data_child3.clear();
        list_data_child3.add(new ChildData(" The most common symptoms of COVID-19 are fever, dry cough, and tiredness. Other symptoms that are less common and may affect some patients include aches and pains, nasal congestion, headache, conjunctivitis, sore throat, diarrhea, loss of taste or smell or a rash on skin or discoloration of fingers or toes. These symptoms are usually mild and begin gradually. Some people become infected but only have very mild symptoms.\n\n Most people (about 80%) recover from the disease without needing hospital treatment. Around 1 out of every 5 people who gets COVID-19 becomes seriously ill and develops difficulty breathing. Older people, and those with underlying medical problems like high blood pressure, heart and lung problems, diabetes, or cancer, are at higher risk of developing serious illness.\n\n However, anyone can catch COVID-19 and become seriously ill. People of all ages who experience fever or  cough associated withdifficulty breathing/shortness of breath, chest pain/pressure, or loss of speech or movement should seek medical attention immediately. If possible, it is recommended to call the health care provider or facility first, so the patient can be directed to the right clinic."));

        list_parent.add(new ParentData("4). What should I do if I have COVID-19 symptoms and when should I seek medical care?",list_data_child4));
        list_data_child4.clear();
        list_data_child4.add(new ChildData(" If you have minor symptoms, such as a slight cough or a mild fever, there is generally no need to seek medical care. Stay at home, self-isolate and monitor your symptoms. Follow national guidance on self-isolation.\n\n However, if you live in an area with malaria or dengue fever it is important that you do not ignore symptoms of fever. Seek medical help. When you attend the health facility wear a mask if possible, keep at least 1 metre distance from other people and do not touch surfaces with your hands. If it is a child who is sick help the child stick to this advice.\n\n Seek immediate medical care, if you have difficulty breathing or pain/pressure in the chest. If possible, call your health care provider in advance, so he/she can direct you to the right health facility."));


        list_parent.add(new ParentData("5). How does COVID-19 spread?",list_data_child5));
        list_data_child5.clear();
        list_data_child5.add(new ChildData(" People can catch COVID-19 from others who have the virus. The disease spreads primarily from person to person through small droplets from the nose or mouth, which are expelled when a person with COVID-19 coughs, sneezes, or speaks. These droplets are relatively heavy, do not travel far and quickly sink to the ground. People can catch COVID-19 if they breathe in these droplets from a person infected with the virus. This is why it is important to stay at least 1 meter away from others. These droplets can land on objects and surfaces around the person such as tables, doorknobs and handrails. People can become infected by touching these objects or surfaces, then touching their eyes, nose or mouth. This is why it is important to wash your hands regularly with soap and water or clean with alcohol-based hand rub.\n\n WHO is assessing ongoing research on the ways that COVID-19 is spread and will continue to share updated findings. "));

        list_parent.add(new ParentData("6). Can COVID-19 be caught from a person who has no symptoms?",list_data_child6));
        list_data_child6.clear();
        list_data_child6.add(new ChildData(" COVID-19 is mainly spread through respiratory droplets expelled by someone who is coughing or has other symptoms such as fever or tiredness. Many people with COVID-19 experience only mild symptoms. This is particularly true in the early stages of the disease. It is possible to catch COVID-19 from someone who has just a mild cough and does not feel ill.\n\n Some reports have indicated that people with no symptoms can transmit the virus. It is not yet known how often it happens. WHO is assessing ongoing research on the topic and will continue to share updated findings."));


        list_parent.add(new ParentData("7). How can we protect others and ourselves if we don't know who is infected?",list_data_child7));
        list_data_child7.clear();
        list_data_child7.add(new ChildData(" Practicing hand and respiratory hygiene is important at all times and is the best way to protect others and yourself.\n\n When possible maintain at least a 1 meter distance between yourself and others. This is especially important if you are standing by someone who is coughing or sneezing.\n\n Since some infected persons may not yet be exhibiting symptoms or their symptoms may be mild, maintaining a physical distance with everyone is a good idea if you are in an area where COVID-19 is circulating. "));


        list_parent.add(new ParentData("8). What should I do if I have come in close contact with someone who has COVID-19?",list_data_child8));
        list_data_child8.clear();
        list_data_child8.add(new ChildData(" If you have been in close contact with someone with COVID-19, you may be infected.\n\n Close contact means that you live with or have been in settings of less than 1 metre from those who have the disease. In these cases, it is best to stay at home.\n\n However, if you live in an area with malaria or dengue fever it is important that you do not ignore symptoms of fever. Seek medical help. When you attend the health facility wear a mask if possible, keep at least 1 metre distant from other people and do not touch surfaces with your hands. If it is a child who is sick help the child stick to this advice.\n\n If you do not live in an area with malaria or dengue fever please do the following:\n\n\n 1) If you become ill, even with very mild symptoms you must self-isolate.\n\n 2) Even if you don’t think you have been exposed to COVID-19 but develop symptoms,then self-isolate and monitor yourself.\n\n 3) You are more likely to infect others in the early stages of the disease when you just have mild symptoms, therefore early self-isolation is very important.\n\n 4) If you do not have symptoms, but have been exposed to an infected person, self-quarantine for 14 days.\n\n\n If you have definitely had COVID-19 (confirmed by a test) self-isolate for 14 days even after symptoms have disappeared as a precautionary measure – it is not yet known exactly how long people remain infectious after they have recovered. Follow national advice on self-isolation."));

        list_parent.add(new ParentData("9). What does it mean to self-isolate?",list_data_child9));
        list_data_child9.clear();
        list_data_child9.add(new ChildData(" Self-isolation is an important measure taken by those who have COVID-19 symptoms to avoid infecting others in the community, including family members.\n\n Self-isolation is when a person who is experiencing fever, cough or other COVID-19 symptoms stays at home and does not go to work, school or public places. This can be voluntarily or based on his/her health care provider’s recommendation. However, if you live in an area with malaria or dengue fever it is important that you do not ignore symptoms of fever. Seek medical help. When you attend the health facility wear a mask if possible, keep at least 1 metre distant from other people and do not touch surfaces with your hands. If it is a child who is sick help the child stick to this advice.\n\n If you do not live in an area with malaria or dengue fever please do the following:\n\n If a person is in self-isolation, it is because he/she is ill but not severely ill (requiring medical attention).\n\n\n 1) have a large, well-ventilated with hand-hygiene and toilet facilities.\n\n 2) If this is not possible, place beds at least 1 metre apart.\n\n 3) Keep at least 1 metre from others, even from your family members.\n\n 4) Monitor your symptoms daily.\n\n 5) Isolate for 14 days, even if you feel healthy.\n\n 6) If you develop difficulty breathing, contact your healthcare provider immediately – call them first if possible.\n\n 7) Stay positive and energized by keeping in touch with loved ones by phone or online, and by exercising yourself at home."));

        list_parent.add(new ParentData("10). What should I do if I have no symptoms, but I think I have been exposed to COVID-19? What does it mean to self-quarantine?",list_data_child10));
        list_data_child10.clear();
        list_data_child10.add(new ChildData(" To self-quarantine means to separate yourself from others because you have been exposed to someone with COVID-19 even though you, yourself, do not have symptoms.\n\n During self-quarantine you monitor yourself for symptoms. The goal of the self-quarantine is to prevent transmission. Since people who become ill with COVID-19 can infect people immediately self-quarantine can prevent some infections from happening.\n\n\n In this case:\n\n 1) Have a large, well-ventilated single room with hand hygiene and toilet facilities.\n\n 2) If this is not available place beds at least 1 metre apart.\n\n 3) Keep at least 1-metre distance from others, even from your family members.\n\n 4) Monitor your symptoms daily \n\n 5) Self-quarantine for 14 days, even if you feel healthy.\n\n 6) If you develop difficulty breathing, contact your healthcare provider immediately – call them first if possible.\n\n 7) Stay positive and energized by keeping in touch with loved ones by phone or online, and by exercising yourself at home.\n\n\n However, if you live in an area with malaria or dengue fever it is important that you do not ignore symptoms of fever. Seek medical help. When you attend the health facility wear a mask if possible, keep at least 1 metre distant from other people and do not touch surfaces with your hands. If it is a child who is sick help the child stick to this advice."));

        list_parent.add(new ParentData("11). What is the difference between self-isolation, self-quarantine and distancing?",list_data_child11));
        list_data_child11.clear();
        list_data_child11.add(new ChildData(" Quarantine means restricting activities or separating people who are not ill themselves but may have been exposed to COVID-19. The goal is to prevent spread of the disease at the time when people just develop symptoms.\n\n Isolation means separating people who are ill with symptoms of COVID-19 and may be infectious to prevent the spread of the disease.\n\n Physical distancing means being physically apart. WHO recommends keeping at least 1-metre distance from others. This is a general measure that everyone should take even if they are well with no known exposure to COVID-19. "));

        list_parent.add(new ParentData("12). Can children or adolescents catch COVID-19?",list_data_child12));
        list_data_child12.clear();
        list_data_child12.add(new ChildData(" Research indicates that children and adolescents are just as likely to become infected as any other age group and can spread the disease.\n\n Evidence to date suggests that children and young adults are less likely to get severe disease, but severe cases can still happen in these age groups.\n\n Children and adults should follow the same guidance on self-quarantine and self-isolation if there is a risk they have been exposed or are showing symptoms. It is particularly important that children avoid contact with older people and others who are at risk of more severe disease."));

        list_parent.add(new ParentData("13). What can I do to protect myself and prevent the spread of disease?",list_data_child13));
        list_data_child13.clear();
        list_data_child13.add(new ChildData(" Stay aware of the latest information on the COVID-19 outbreak, available on the WHO website and through your national and local public health authority. Most countries around the world have seen cases of COVID-19 and many are experiencing outbreaks. Authorities in China and some other countries have succeeded in slowing their outbreaks.\n\n However, the situation is unpredictable so check regularly for the latest news. You can reduce your chances of being infected or spreading COVID-19 by taking some simple precautions:\n\n\n 1) Regularly and thoroughly clean your hands with an alcohol-based hand rub or wash them with soap and water. Why? Washing your hands with soap and water or using alcohol-based hand rub kills viruses that may be on your hands.\n\n 2) Maintain at least 1 metre distance between yourself and others. Why? When someone coughs, sneezes, or speaks they spray small liquid droplets from their nose or mouth which may contain virus. If you are too close, you can breathe in the droplets, including the COVID-19 virus if the person has the disease.\n\n 3) Avoid going to crowded places. Why? Where people come together in crowds, you are more likely to come into close contact with someone that has COVID-19 and it is more difficult to maintain physical distance of 1 metre.\n\n 4) Avoid touching eyes, nose and mouth. Why? Hands touch many surfaces and can pick up viruses. Once contaminated, hands can transfer the virus to your eyes, nose or mouth. From there, the virus can enter your body and infect you.\n\n 5) Make sure you, and the people around you, follow good respiratory hygiene. This means covering your mouth and nose with your bent elbow or tissue when you cough or sneeze. Then dispose of the used tissue immediately and wash your hands. Why? Droplets spread virus. By following good respiratory hygiene, you protect the people around you from viruses such as cold, flu and COVID-19.\n\n 6) Stay home and self-isolate even with minor symptoms such as cough, headache, mild fever, until you recover. Have someone bring you supplies. If you need to leave your house, wear a mask to avoid infecting others. Why? Avoiding contact with others will protect them from possible COVID-19 and other viruses.\n\n 7) If you have a fever, cough and difficulty breathing, seek medical attention, but call by telephone in advance if possible and follow the directions of your local health authority. Why? National and local authorities will have the most up to date information on the situation in your area. Calling in advance will allow your health care provider to quickly direct you to the right health facility. This will also protect you and help prevent spread of viruses and other infections.\n\n 8) Keep up to date on the latest information from trusted sources, such as WHO or your local and national health authorities. Why? Local and national authorities are best placed to advise on what people in your area should be doing to protect themselves."));

        list_parent.add(new ParentData("14). Is there a vaccine, drug or treatment for COVID-19?",list_data_child14));
        list_data_child14.clear();
        list_data_child14.add(new ChildData(" While some western, traditional or home remedies may provide comfort and alleviate symptoms of mild COVID-19, there are no medicines that have been shown to prevent or cure the disease. WHO does not recommend self-medication with any medicines, including antibiotics, as a prevention or cure for COVID-19.\n\n However, there are several ongoing clinical trials of both western and traditional medicines. WHO is coordinating efforts to develop vaccines and medicines to prevent and treat COVID-19 and will continue to provide updated information as soon research results become available.\n\n The most effective ways to protect yourself and others against COVID-19 are to:\n\n 1) Clean your hands frequently and thoroughly.\n\n 2) Avoid touching your eyes, mouth and nose.\n\n 3) Cover your cough with the bend of elbow or tissue. If a tissue is used, discard it immediately and wash your hands.\n\n 4) Maintain a distance of at least 1 metre from others."));

        list_parent.add(new ParentData("15). How to properly wear a medical mask?",list_data_child15));
        list_data_child15.clear();
        list_data_child15.add(new ChildData(" If you choose to wear a mask:\n\n\n 1) Before touching the mask, clean hands with an alcohol-based hand rub or soap and water.\n\n 2) Take the mask and inspect it for tears or holes.\n\n 3) Orient which side is the top side (where the metal strip is).\n\n 4) Ensure the proper side of the mask faces outwards (the coloured side).\n\n 5) Place the mask to your face. Pinch the metal strip or stiff edge of the mask so it moulds to the shape of your nose.\n\n 6) Pull down the mask’s bottom so it covers your mouth and your chin.\n\n 7) Do not touch the mask while you are wearing it for protection.\n\n 8) After use, take off the mask with clean hands; remove the elastic loops from behind the ears while keeping the mask away from your face and clothes, to avoid touching potentially contaminated surfaces of the mask.\n\n 9) Discard the mask in a closed bin immediately after use. Do not reuse the mask.\n\n 10) Perform hand hygiene after touching or discarding the mask – Use alcohol-based hand rub or, if visibly soiled, wash your hands with soap and water.\n\n\n Be aware that there is a global shortage of medical masks (both surgical masks and N95 masks). These should be reserved as much as possible for health care workers.\n\n Remember that  masks are not a substitute for other, more effective ways to protect yourself and others against COVID-19 such as frequently washing your hands, covering your cough with the bend of elbow or tissue and maintain a distance of at least 1 meter from others. See basic protective measures against the new coronavirus for more information.\n\n Follow the advice of your national health authority on the use of masks."));


/*
        list_parent.add(new ParentData("2). What is COVID-19?",list_data_child));
        list_parent.add(new ParentData("3). What are the symptoms of COVID-19?",list_data_child));
        list_parent.add(new ParentData("4). What should I do if I have COVID-19 symptoms and when should I seek medical care?",list_data_child));
*/

        return list_parent;
    }
}
