<template>

    <v-card outlined>
        <v-card-title>
            CreateRecipe
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="Description" v-model="value.description" :editMode="editMode"/>
            <String label="Ingredients" v-model="value.ingredients" :editMode="editMode"/>
            <String label="CookingSteps" v-model="value.cookingSteps" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createRecipe"
            >
                CreateRecipe
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateRecipeCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.description = '';
            this.value.ingredients = [];
            this.value.cookingSteps = [];
        },
        watch: {
        },
        methods: {
            createRecipe() {
                this.$emit('createRecipe', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

