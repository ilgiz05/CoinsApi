package com.ilgiz.coinsapi.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseDiffUtilJv<T extends BaseDiffUtilModel> extends DiffUtil.ItemCallback<T> {
        @Override
        public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
                return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
                return oldItem.equals(newItem);
        }
}
