/* Tencent is pleased to support the open source community by making Hippy available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencent.mtt.hippy.dom.node;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * @Description: TODO
 * @author: edsheng
 * @date: 2018/8/7 10:07
 * @version: V1.0
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class HippyLetterSpacingSpan extends MetricAffectingSpan
{

	float	mSpace;

	public HippyLetterSpacingSpan(float mSpace)
	{
		this.mSpace = mSpace;
	}

	@Override
	public void updateMeasureState(TextPaint p)
	{
		if (!Float.isNaN(mSpace))
		{
				p.setLetterSpacing(mSpace / p.getTextSize());
		}
	}



	@Override
	public void updateDrawState(TextPaint tp)
	{
		if (!Float.isNaN(mSpace))
		{
			tp.setLetterSpacing(mSpace / tp.getTextSize());
		}
	}
}
