# ListViewEasyAdapter

ListViewEasyAdapter is a convenient adapter for ListView,and it is written on the basis of [BaseAdapter](https://developer.android.com/reference/android/widget/BaseAdapter).

## Gradle via JitPack

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):


```gradle
allprojects {
	repositories {
        maven { url "https://jitpack.io" }
    }
}
```

Then, add the library to your module `build.gradle`:

```gradle
dependencies {

}
```

`latest.version` is


## Maven

Add the JitPack repository to your build file:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency:

```xml
<dependency>
    <groupId>com.github.ZYRzyr</groupId>

    <version>latest.version</version>
</dependency>
```

## Usage

**1**.Crete a class to extends `ListViewEasyAdapter`,such as:

```
public class SimpleAdapter extends ListViewEasyAdapter<String, SimpleAdapter.ViewHolder> {

    public SimpleAdapter(List<String> data) {
        super(data);
    }

    @Override
    protected int setLayoutRes() {
        return R.layout.item_simple;
    }

    @Override
    protected ViewHolder initViewHolder() {
        return new ViewHolder();
    }

    @Override
    protected void initView(ViewHolder holder, View view) {
        holder.textView = view.findViewById(R.id.text_view);
    }

    @Override
    protected void setupView(ViewHolder holder, int position) {
        holder.textView.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));
        holder.textView.setText(data.get(position));
    }

    static class ViewHolder {
        TextView textView;
    }
}
```

**2**.Use `setLayoutRes()` to set your item's `layout.xml`.
**3**.Create a `ViewHolder` to declare your view in your `layout.xml`,and use it at `initViewHolder()`.
**4**.Initialize the views which are in `ViewHolder` at `initView(holder: ViewHolder, view: View)`.
**5**.Do what you want to do at `setupView(holder: ViewHolder, position: Int)`.

## Issues

If you find a problem or have some better advice,please pull a [issue](https://github.com/ZYRzyr/ListViewEasyAdapter/issues) to help me to fix it!

### *License*

ListViewEasyAdapter is released under the [Apache 2.0 license](LICENSE).

```
Copyright 2019 Yuran Zhang

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at following link.

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
