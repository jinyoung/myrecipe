<template>

    <v-card outlined>
        <v-card-title>
            CreateManual
        </v-card-title>

        <v-card-text>
            <String label="RecipeId" v-model="value.recipeId" :editMode="editMode"/>
            <String label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createManual"
            >
                CreateManual
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
        name: 'CreateManualCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.recipeId = '';
            this.value.customerId = '';
        },
        watch: {
        },
        methods: {
            createManual() {
                this.$emit('createManual', this.value);
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

