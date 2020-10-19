package com.example.citiclubapp.MainPage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.View;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.NameTitle;

import static androidx.navigation.fragment.NavHostFragment.findNavController;

/**
 * author:吴瀚之
 * todo：实现底部导航效果
 */
public class real_name_authentificationActivity extends AppCompatActivity {
    MotionLayout businesshallMotionLayout,
            mybusinessMotionLayout,
            noticeMotionLayout,
            personalCenterMotionLayout;
    NameTitle nameTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_name_authentification);
        /**
         * todo:初始化对象
         */
        businesshallMotionLayout=findViewById(R.id.businesshall_motionLayout);
        mybusinessMotionLayout=findViewById(R.id.my_business_motionLayout);
        noticeMotionLayout=findViewById(R.id.notice_motionLayout);
        personalCenterMotionLayout=findViewById(R.id.personal_center_motionLayout);
//        nameTitle=findViewById(R.id.name_title1);
//        nameTitle.setText("仓单宝");
        Fragment fragment=getSupportFragmentManager().findFragmentById(R.id.navhostfragment);
        /**
         * todo:实现碎片的切换
         */
        final NavController navController=findNavController(fragment);
        businesshallMotionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.business_hall_Fragment);
            }
        });
        mybusinessMotionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.myBusinessFragment);
            }
        });
        noticeMotionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.noticeFragment);
            }
        });
        personalCenterMotionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.personalCenterFragment);
            }
        });
        /**
         * todo:实现碎片的切换与按钮动画形态的同步
         */
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                businesshallMotionLayout.setProgress(0.1f);
                mybusinessMotionLayout.setProgress(0.1f);
                noticeMotionLayout.setProgress(0.1f);
                personalCenterMotionLayout.setProgress(0.1f);
                switch (destination.getId()){
                    case R.id.business_hall_Fragment:
                        businesshallMotionLayout.transitionToEnd();
                        break;
                    case R.id.myBusinessFragment:
                        mybusinessMotionLayout.transitionToEnd();
                        break;
                    case R.id.noticeFragment:
                        noticeMotionLayout.transitionToEnd();;
                        break;
                    case R.id.personalCenterFragment:
                        personalCenterMotionLayout.transitionToEnd();
                        break;
                }

            }
        });
    }


}